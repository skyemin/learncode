package com.wei.learncode.geekAlgorithm.day3;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/25 13:12
 */
public class ClimbStairs {

    //递归
   /* public int climbStairs(int n) {
      if(n == 1){
          return 1;
      }
      if(n ==2){
          return 2;
      }
      return climbStairs(n-1)+climbStairs(n-2);
    }*/
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        if(n ==2){
            return 2;
        }
        int a=1,b=2,tmp;
        for (int i = 3; i <= n; i++) {
            tmp = a;
            a = b;
            b = tmp + a;
        }
        return b;
    }

}
