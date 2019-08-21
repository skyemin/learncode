package com.wei.learncode.algorithm;

import java.util.*;

/**
 * @Author: weizz
 * @Date: 2019/8/15 16:26
 * @Description:
 * @Version:1.0
 */
public class Test {

    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put("a","a");
        map.put("b","b");
        map.put("c","c");

        List<Map.Entry<String,String>> list = new ArrayList<Map.Entry<String,String>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return 0;
            }
        });

    }
}
