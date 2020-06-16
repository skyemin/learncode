package com.wei.learncode.jvm;

import java.lang.ref.SoftReference;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: skye
 * @Date: 2020/4/23 11:00
 * @Description:
 * @Version:1.0
 */
public class Test6 {

    public Object object;

    public static final int _1Mb = 1024*1024;

    public byte[] bigSize = new byte[2*_1Mb];

    public static void main(String[] args) {

        Test6 a = new Test6();
        a = null;
        /*Test6 b = new Test6();

        a.object = b;
        b.object = a;*/

        SoftReference r = new SoftReference(a);
        System.gc();

    }
}
