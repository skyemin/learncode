package com.wei.learncode.bloomfilter;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: skye
 * @Date: 2019/11/21 9:43
 * @Description:
 * @Version:1.0
 */
public class TestHashMap {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 1000000; i++) {
            set.add(i);
        }
        System.out.println(set.contains(1));
        System.out.println(set.contains(2));
        System.out.println(set.contains(3));
        long end = System.currentTimeMillis();
        System.out.println("花费时间:"+(end-start)+"毫秒");
    }
}
