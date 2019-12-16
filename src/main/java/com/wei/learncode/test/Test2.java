package com.wei.learncode.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: skye
 * @Date: 2019/12/10 17:43
 * @Description:
 * @Version:1.0
 */
public class Test2 {
    public static int a ;

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a",1);
        test(map);
        System.out.println(map.get("a"));
    }

    private static void test(Map map) {
        map.put("a",10);
    }
}
