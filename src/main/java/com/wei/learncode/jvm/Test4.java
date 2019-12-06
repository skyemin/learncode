package com.wei.learncode.jvm;

import java.lang.reflect.Method;

/**
 * @Author: skye
 * @Date: 2019/11/25 15:39
 * @Description:
 * @Version:1.0
 */
public class Test4 {
    public static void target(int i) {
        new Exception("#" + i).printStackTrace();
    }

    public static void main(String[] args) throws Exception {
        Class<?> klass = Class.forName("Test4");
        Method method = klass.getMethod("target", int.class);
        method.invoke(null, 0);
    }
}
