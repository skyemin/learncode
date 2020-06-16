package com.wei.learncode.jvm;

/**
 * @Author: skye
 * @Date: 2020/5/30 17:49
 * @Description: 大对象直接进入老年代
 * @Version:1.0
 */
public class Test8 {

    private static final int _1MB = 1024 * 1024;

    public static void testPretenureSizeThreshold() {
        byte[] allocation;
        allocation = new byte[4 * _1MB]; //直接分配在老年代中
    }

    public static void main(String[] args) {
        testPretenureSizeThreshold();
    }
}
