package com.wei.learncode.reflect1;

import org.springframework.beans.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Test test1 = new Test();
        Class<?> aClass = Class.forName("com.wei.learncode.reflect2.Test");
        Method[] methods = aClass.getMethods();
        Method method1 = null;
        for (Method method : methods) {
            if(method.getName().equals("test")){
                method1 = method;
            }
        }
        Object o = aClass.newInstance();
        BeanUtils.copyProperties(test1,o);
        method1.invoke(aClass.newInstance(),o);
    }
}
