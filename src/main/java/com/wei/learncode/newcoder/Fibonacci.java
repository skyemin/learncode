package com.wei.learncode.newcoder;

import java.util.HashMap;
import java.util.Map;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/15 10:19
 */
public class Fibonacci {

    Map<Integer,Integer> map = new HashMap<>();
    public int Fibonacci(int n) {
        if(n < 2){
            return n;
        }
        int a = 0;
        int b = 1;
        int tmp = 0;
        for (int i = 3; i <=n ; i++) {
            tmp = a+b;
            a = b;
            b = tmp;
        }
        return tmp;
    }
}
