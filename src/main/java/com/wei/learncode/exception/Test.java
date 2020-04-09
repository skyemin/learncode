package com.wei.learncode.exception;

import com.wei.learncode.jvm.Test1;

import java.io.IOException;

/**
 * @Author: skye
 * @Date: 2020/2/12 14:47
 * @Description:
 * @Version:1.0
 */
public class Test {

    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        try {
            test2();
        }catch (Exception e){
            System.out.println(222);
        }

    }
    public static void test2() throws Exception{
            int i  = 1/0;
    }
}
