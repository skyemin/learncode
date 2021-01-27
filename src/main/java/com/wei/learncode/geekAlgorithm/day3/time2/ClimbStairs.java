package com.wei.learncode.geekAlgorithm.day3.time2;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/26 15:34
 */
public class ClimbStairs {

    /*public int climbStairs(int n) {
        //每次只能爬1或2个台阶,爬到第n阶只能从n-1或者n-2爬上去
        if(n <=2){
            return n;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }*/
    /*public int climbStairs(int n) {
        //每次只能爬1或2个台阶,爬到第n阶只能从n-1或者n-2爬上去
        //用哈希去暂存重复计算的台阶走法
        if(n <=2){
            return n;
        }
        Map<Integer,Integer> map = new HashMap();
        int tmp;
        if(map.get(n) != null){
            return map.get(n);
        }else{
            tmp = climbStairs(n-1)+climbStairs(n-2);
            map.put(n,tmp);
        }
        return tmp;
    }*/
    public int climbStairs(int n) {
        if(n <=2){
            return n;
        }
        int a = 1,b = 2,tmp;
        for (int i = 3; i < n; i++) {
            tmp = a;
            a = b;
            b = tmp+b;
        }
        return b;
    }
}


