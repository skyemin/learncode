package com.wei.learncode.begin;

/**
 * @Author: skye
 * @Date: 2020/8/14 9:27
 * @Description:
 * @Version:1.0
 */
public class IsPerfectSquare {

    public static void main(String[] args) {
        //System.out.println(Math.sqrt(808201));
        System.out.println(isPerfectSquare(808201));
    }

    public static boolean isPerfectSquare(int num) {

        if(num == 1){
            return true;
        }
        int start = 0;
        int end = num/2;
        double middle;
        while(start <= end){
            middle = (start+end)/2;
            if(middle*middle == num){
                return true;
            }
            if(middle*middle > num){
                end = (int) (middle -1);
            }else{
                start = (int) (middle +1);
            }
        }
        return false;
    }
}
