package com.wei.learncode.geekAlgorithm.day11;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/3/9 15:26
 */
public class IsPerfectSquare {

    public boolean isPerfectSquare(int num) {
        long left = 0;
        long right = num/2+1;
        long mid;
        while (left < right){
            mid = (left +right + 1)/2;
            if(mid*mid == num){
                return true;
            }
            if(mid*mid < num){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        return false;
    }
}
