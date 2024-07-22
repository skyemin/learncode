package com.wei.learncode.retry;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.support.AopUtils;

import java.lang.reflect.Method;

@Data
@Slf4j
public class TaskInfo {

    private Long id;

    private int maxRetryTimes;

    private Method method;

    private Object target;

    private Object[] arguments;

    private MethodInfoDO methodInfoDO;


    public boolean retry() {
        try {
            AopUtils.invokeJoinpointUsingReflection(this.getTarget(), this.getMethod(), this.getArguments());
            return true;
        } catch (Throwable throwable) {
            //LoggerUtil.error(log, throwable, "AsyncRetry TaskInfo failed ! ClassName = {}, MethodName = {}, Args{}", this.getTarget().getClass().getName(), this.getMethod().getName(), JSONObject.toJSONString(arguments));
            return false;
        }
    }
}
