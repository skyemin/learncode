package com.wei.learncode.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: weizz
 * @Date: 2019/10/14 10:13
 * @Description: 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * @Version:1.0
 */
public class ClimbStairs {

    Map<Integer,Integer> map = new HashMap<>();
    //本问题其实常规解法可以分成多个子问题，爬第n阶楼梯的方法数量，等于 2 部分之和
    //爬上 n-1 阶楼梯的方法数量。因为再爬1阶就能到第n阶
    //爬上 n-2 阶楼梯的方法数量，因为再爬2阶就能到第n阶
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
    public int climbStairs2(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }else{
            int num = climbStairs2(n-1)+climbStairs2(n-2);
            map.put(n,num);
            return num;
        }
    }
    public int climbStairs3(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int a = 1;
        int b = 2;
        int temp = 0;
        for(int i = 3;i<=n;i++){
            temp = a+b;
            a = b;
            b = temp;
        }
        return temp;
    }
}
