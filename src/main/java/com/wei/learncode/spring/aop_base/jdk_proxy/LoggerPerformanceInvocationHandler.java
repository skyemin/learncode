package com.wei.learncode.spring.aop_base.jdk_proxy;


import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
public class LoggerPerformanceInvocationHandler implements InvocationHandler {
    private final Object target;
    private static final ConcurrentHashMap<Method, Integer> methodCallCount = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Method, Integer> lastQpsMap = new ConcurrentHashMap<>();
    private static ScheduledExecutorService scheduler;

    static {
        startQpsRecordingTask();
    }

    private static synchronized void startQpsRecordingTask() {
        try {
            if (scheduler != null) {
                return;
            }
            scheduler = Executors.newSingleThreadScheduledExecutor();
            Runnable task = () -> {
                for (ConcurrentHashMap.Entry<Method, Integer> entry : methodCallCount.entrySet()) {
                    Method method = entry.getKey();
                    int callsInLastSec = entry.getValue();
                    // 更新 QPS 映射表
                    lastQpsMap.put(method, callsInLastSec);

                    log.warn("method:{}|lastQps:{}", method.getName(), callsInLastSec);

                    // 清零该秒的计数值
                    methodCallCount.put(method, 0);
                }
            };
            scheduler.scheduleAtFixedRate(task, 1, 1, TimeUnit.SECONDS);
        } catch (Exception e) {
            log.error("startQpsRecordingTask error", e);
        }
    }

    public LoggerPerformanceInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        long startTime = System.nanoTime();
        try {
            int currentQps = 0;
            if (scheduler != null) {
                // 增加当前秒的调用次数
                methodCallCount.merge(method, 1, Integer::sum);
                // 获取最新的QPS值
                currentQps = lastQpsMap.getOrDefault(method, 0);
            }

            log.warn("method:{}|lastQps:{}|param:{}|trace:{}", method.getName(), currentQps, JSON.toJSONString(args));
            result = method.invoke(target, args);
        } catch (Throwable t) {
            log.error("Exception|method:{}|msg:{}|trace:{}",method.getName(), t.getMessage());
            throw t;
        } finally {
            long endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1e6; // 转换为毫秒
            log.warn("method:{}|rt:{}ms|result:{}|trace:{}", method.getName(),duration,JSON.toJSONString(result));
        }

        return result;
    }
}

