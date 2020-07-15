package com.wei.learncode.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: skye
 * @Date: 2020/7/8 10:57
 * @Description:
 * @Version:1.0
 */
public class Test {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list2 = list1;
        for (int i = 0; i < 10; i++) {
            list2.add(i);
        }
        System.out.println(111);
    }
}
