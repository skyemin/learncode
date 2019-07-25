package com.wei.learncode.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: weizz
 * @Date: 2019/7/9 10:21
 * @Description:
 * @Version:1.0
 */
public class TestReferencePass {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("key","123");
        changeDog(map);
        System.out.println(map.get("age"));
    }

    private static void changeDog(Map map) {
        map.put("age","456");
    }
}
