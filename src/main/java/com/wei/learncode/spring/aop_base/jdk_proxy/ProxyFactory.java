package com.wei.learncode.spring.aop_base.jdk_proxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {
    private final Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new LoggerPerformanceInvocationHandler(target));
    }

    public static Object getProxyInstance(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new LoggerPerformanceInvocationHandler(target));
    }
}