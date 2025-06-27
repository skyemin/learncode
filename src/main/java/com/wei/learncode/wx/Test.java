package com.wei.learncode.wx;

public class Test {


    public static int divide(int dividend,int divisor){
        //是否负数
        boolean isNeg = (dividend>0 && divisor<0) || (dividend<0 && divisor >0);
        //转成负数
        if(dividend>0){
            dividend = -dividend;
        }
        if(divisor>0){
            divisor = -divisor;
        }
        int ans = 0;
        while(dividend <= divisor){
            int param = divisor;
            int tmp = 1;
            while(dividend-param <= param){
                param += param;
                tmp += tmp;
            }
            ans += tmp;
            dividend = dividend - param;
        }
        return isNeg?-ans:ans;
    }
    public static void main(String[] args) {


    }
}


