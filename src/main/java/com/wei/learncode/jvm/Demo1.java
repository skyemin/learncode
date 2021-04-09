package com.wei.learncode.jvm;

/**
 * @author skye
 * @version 1.0
 * @description:  对象在新生代回收
 * @date 2021/3/30 17:51
 */
public class Demo1 {

    public static void main(String[] args) {

        byte[] array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = null;
        byte[] array2 = new byte[2 * 1024 * 1024];
    }
}
