package com.wei.learncode;

import java.util.Vector;

/**
 * @Author: weizz
 * @Date: 2019/8/26 10:23
 * @Description:
 * @Version:1.0
 */
public class MemoryLeak {

    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 100; i++) {
            Object o = new Object();
            v.add(o);
            o = null;
        }
    }
}
