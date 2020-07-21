package com.wei.learncode.study;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: skye
 * @Date: 2020/7/20 18:44
 * @Description:
 * @Version:1.0
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton(){

    };
    /*public static Singleton getInstance(){

        if(singleton == null){
            return new Singleton();
        }
        return singleton;
    }*/

    public static Singleton getInstance(){
        return singleton;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton1 = constructor.newInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
