package com.wei.learncode.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/3/23 10:41
 */
public class ResizeTest {


    public static void main(String[] args) {

        //扩容发生在第4个元素放进去的时候
        Map map = new HashMap(4);
        map.put("a",1);
        map.put("b",1);
        map.put("c",1);
        //map.put("a",1);
    }
}
