package com.wei.learncode.geekAlgorithm.day3.time4;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/9/7 16:20
 */
public class ClimbStairs {

    public int climbStairs(int n) {

        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        if(n == 3){
            return 4;
        }
        int a=1,b=2,c=4,tmp;
        for (int i = 4; i <= n; i++) {
           tmp = a;
           a = b;
           b = c;
           c = tmp+a+b;
        }
        return c;
    }
}
