package com.wei.learncode.geekAlgorithm.day11;

/**
 * @author skye
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/sqrtx/submissions/
 * @date 2021/3/9 15:09
 */
public class MySqrt {

    public int mySqrt(int x) {
        long left = 0;
        long right = x/2+1;
        long mid;
        while (left < right){
            mid = (left +right + 1)/2;
            if(mid*mid == x){
                return (int)mid;
            }
            if(mid*mid < x){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        return (int)left;
    }

    public static void main(String[] args) {
        MySqrt mySqrt = new MySqrt();
        System.out.println(mySqrt.mySqrt(16));
    }
}
