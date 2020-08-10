package com.wei.learncode.test;

/**
 * @Author: skye
 * @Date: 2020/7/21 18:23
 * @Description:
 * @Version:1.0
 */
public class B {

    public static void aaa(A a){
        System.out.println("开始执行");
        a.test();
    }

    public static void main(String[] args) {
        aaa(()->{
            System.out.println(1111);
        });
    }
}
