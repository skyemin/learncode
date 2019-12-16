package com.wei.learncode.test;

import com.wei.learncode.thread.basic.Test;

/**
 * @Author: weizz
 * @Date: 2019/7/3 19:17
 * @Description:
 * @Version:1.0
 */
public abstract class Person {
    public Person(String name){
        System.out.println(name);
    }

    public final void test2(){
        System.out.println("123");
    }
}
