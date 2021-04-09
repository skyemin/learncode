package com.wei.learncode.jvm;

/**
 * @author skye
 * @version 1.0
 * @description: 对象进入老年代
 * @date 2021/4/1 15:27
 */
public class Demo2 {

    public static void main(String[] args) {

        byte[] array1 = new byte[2*1024*1024];
        array1 = new byte[2*1024*1024];
        array1 = new byte[2*1024*1024];
        array1 = null;

        byte[] array2 = new byte[128 * 1024];
        byte[] array3 = new byte[2 * 1024 * 1024];

        array3 = new byte[2 * 1024 * 1024];
        array3 = new byte[2 * 1024 * 1024];
        array3 = new byte[128 * 1024];
        array3 = null;

        byte[] array4 = new byte[2 * 1024 * 1024];

    }
}
