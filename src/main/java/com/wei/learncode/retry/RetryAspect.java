package com.wei.learncode.retry;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Date;

@Slf4j
@Aspect
@Component
public class RetryAspect {

    private static final SpelExpressionParser parser = new SpelExpressionParser();

    @Autowired
    private Environment environment;

    @Autowired
    private IMethodInfoRepository methodInfoRepository;

    @Around(value = "@annotation(com.alipay.gesaas.ms.mall.provider.retry.Retryable)", argNames = "joinPoint")
    public Object doAround(ProceedingJoinPoint joinPoint) {
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        Retryable retryable = method.getAnnotation(Retryable.class);
        try {
            Object result = joinPoint.proceed();
            if (retryIfResultMatchExpression(joinPoint, retryable, result)) {
                return retry(joinPoint, retryable, null);
            }
            return result;
        } catch (Throwable throwable) {
            if (RetrySupport.canRetryable(throwable, retryable)) {
                if (retryable.retryMode() == RetryModeEnum.SYNC) {
                    try {
                        return retry(joinPoint, retryable, throwable);
                    } catch (Throwable e) {
                        //LoggerUtil.error(log, e, "同步重试失败, 继续抛出异常 className = {}, methodName = {}, errorMsg = {}", method.getDeclaringClass().getName(), method.getName(), e.getMessage());
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        buildMethodInfoDO(joinPoint, throwable);
                    } catch (Exception e) {
                        //LoggerUtil.error(log, e, "持久化方法重试信息失败! className = {}, methodName = {}, errorMsg = {}", method.getDeclaringClass().getName(), method.getName(), e.getMessage());
                        throw new RuntimeException(e);
                    }
                    return null;
                }
            }
            throw new RuntimeException(throwable);
        }
    }

    private void buildMethodInfoDO(ProceedingJoinPoint joinPoint, Throwable throwable) throws UnknownHostException {

        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        Retryable retryable = method.getAnnotation(Retryable.class);

        MethodInfoDO ret = new MethodInfoDO();

        ret.setAppName(environment.getProperty("spring.application.name"));
        ret.setClassName(method.getDeclaringClass().getName());
        ret.setIp(InetAddress.getLocalHost().getHostAddress());
        ret.setMethodName(method.getName());
        ret.setParameterTypes(JSONObject.toJSONString(Arrays.asList(method.getParameterTypes())));
        ret.setArguments(JSONObject.toJSONString(Lists.newArrayList(joinPoint.getArgs())));
        ret.setExceptionDesc(throwable != null ? throwable + ": " + throwable.getMessage() : "no exception");
        ret.setRetryTimes(retryable.maxRetryAttemptNumber());
        ret.setRetryStatus(RetryStatusEnum.RETRYING);
        ret.setCurrentRetryTimes(NumberUtils.INTEGER_ZERO);
        //ret.setTenantId(TenantUtils.getTenant());

        String uniqueKey = DigestUtils.md5Hex(JSONObject.toJSONString(ret));
        ret.setUniqueKey(uniqueKey);
        ret.setNextRetryTime(DateUtil.addDate(new Date(), retryable.timeUnit(), retryable.delay()));
        //ret.setTraceId(TraceUtils.getTraceId());
        methodInfoRepository.save(ret);
    }


    private boolean retryIfResultMatchExpression(ProceedingJoinPoint joinPoint, Retryable retryable, Object result) throws UnknownHostException {
        if (StringUtils.isNotEmpty(retryable.retryIfResultExpression())) {
            StandardEvaluationContext sec = new StandardEvaluationContext();
            sec.setVariable("result", result);
            Expression expression = parser.parseExpression(retryable.retryIfResultExpression());
            Object value = expression.getValue(sec);
            if (value instanceof Boolean) {
                if (Boolean.class.cast(value)) {
                    if (retryable.retryMode() == RetryModeEnum.SYNC) {
                        return true;
                    } else {
                        buildMethodInfoDO(joinPoint, null);
                    }
                }
            }
        }
        return false;
    }

    private Object retry(ProceedingJoinPoint joinPoint, Retryable retryable, Throwable throwable) throws Throwable {
        for (int i = 0; i < retryable.maxRetryAttemptNumber(); i++) {
            try {
                // todo 根据时间单位进行sleep
                Thread.sleep(DateUtil.convertDate2Millis(retryable.delay(), retryable.timeUnit()));
                Object ret = joinPoint.proceed();
                if (retryIfResultMatchExpression(joinPoint, retryable, ret)) {
                    continue;
                }
                return ret;
            } catch (Throwable e) {
                if (i == retryable.maxRetryAttemptNumber() - 1) {
                    throw throwable;
                }
                //LoggerUtil.warn(log, "第{}次重试失败! e {}", i, e);
            }
        }
        throw throwable;
    }
}
