package com.wei.learncode.source;

import java.util.HashMap;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2020/10/30 10:12
 */
public class HashMapCode {

    public static void main(String[] args) {

        int n = 4;
        int hash = 8;
        System.out.println(hash & n);
        System.out.println(hash & (n-1));



        HashMap map = new HashMap(1);
        map.put("test1",1);
        map.put("test2",1);
        map.put("test3",1);
        map.put("test4",1);
        map.put("test5",1);
    }
}
