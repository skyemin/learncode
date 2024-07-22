package com.wei.learncode.retry;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.Pair;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class TransferUtil {

    public static TaskInfo transfer2Task(MethodInfoDO methodInfoDO) {
        try {
            TaskInfo taskInfo = new TaskInfo();
            taskInfo.setId(methodInfoDO.getId());
            Object target = SpringUtils.getBean(Class.forName(methodInfoDO.getClassName()));
            target = AopTargetUtil.getTarget(target);
            Pair<Class<?>[], Object[]> parameterPair = getParameterPair(methodInfoDO);
            Method method = target.getClass().getMethod(methodInfoDO.getMethodName(), parameterPair.getLeft());
            taskInfo.setTarget(target);
            taskInfo.setMethod(method);
            taskInfo.setArguments(parameterPair.getRight());
            taskInfo.setMaxRetryTimes(methodInfoDO.getRetryTimes());
            taskInfo.setMethodInfoDO(methodInfoDO);
            return taskInfo;
        } catch (Exception e) {
            //LoggerUtil.error(log, e, "methodInfo", JSON.toJSONString(methodInfoDO));
        }
        return null;
    }


    private static Pair<Class<?>[], Object[]> getParameterPair(MethodInfoDO methodInfoDO) {
        List<String> parameterList = JSON.parseObject(methodInfoDO.getParameterTypes(), new TypeReference<List<String>>() {
        });
        List<? extends Class<?>> parameterTypeList = parameterList.stream().map(parameterType -> {
            try {
                return Class.forName(parameterType);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toList());
        Class<?>[] parameterTypes = new Class[parameterList.size()];
        parameterTypeList.toArray(parameterTypes);

        List<String> argumentStringList = JSON.parseObject(methodInfoDO.getArguments(), new TypeReference<List<String>>() {
        });

        Object[] arguments = new Object[parameterList.size()];
        for (int i = 0; i < argumentStringList.size(); i++) {
            String argumentString = argumentStringList.get(i);
            Class<?> parameterType = parameterTypeList.get(i);
            arguments[i] = BeanUtil.convert(parameterType, argumentString);
        }
        return Pair.of(parameterTypes, arguments);
    }
}
