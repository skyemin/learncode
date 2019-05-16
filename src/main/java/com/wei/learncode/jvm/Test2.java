package com.wei.learncode.jvm;

/**
 * @Author: weizz
 * @Date: 2019/5/5 14:40
 * @Description:
 * @Version:1.0
 */
public class Test2 {
    public static final int _1Mb = 1024*1024;

    public static void main(String[] args) {
        byte[] a,b,c,d;
        a = new byte[2 * _1Mb];
        b = new byte[2 * _1Mb];
        c = new byte[2 * _1Mb];
        d = new byte[4 * _1Mb];
    }
}
