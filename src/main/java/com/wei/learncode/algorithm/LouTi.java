package com.wei.learncode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: weizz
 * @Date: 2019/8/23 15:11
 * @Description:
 * @Version:1.0
 */
public class LouTi {

    //n阶楼梯,每次爬1或2阶,共有多少种走法

    Map map = new HashMap();
    public int test(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return test(n-1)+test(n-2);
    }
}
