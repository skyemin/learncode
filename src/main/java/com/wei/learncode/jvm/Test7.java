package com.wei.learncode.jvm;

/**
 * @Author: skye
 * @Date: 2020/5/30 15:52
 * @Description: 对象优先在Eden分配
 * @Version:1.0
 */
public class Test7 {

    public static final int _1Mb = 1024 * 1024;
    public static void main(String[] args) {

        byte[] a,b,c,d;
        a= new byte[2*_1Mb];
        b= new byte[2*_1Mb];
        c= new byte[2*_1Mb];
        d= new byte[2*_1Mb];
    }
}
