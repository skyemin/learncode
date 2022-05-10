package com.wei.learncode.design.adapt.begin;

/**
 * @Author: skye
 * @Date: 2020/8/25 18:35
 * @Description: 2……5
 * @Version:1.0
 */
public class MyPow {

    public double myPowChange(double x, int n) {

        if(n == 0){
            return 1;
        }
        double v = myPowChange(x, n / 2);
        if(n % 2 == 0){
            //偶数直接返回乘积
            return v*v;
        }else{
            return  v*v*x;
        }
    }

    public double myPow(double x, int n) {
        //如果n为负数,x变为1/x,n变为正数
        if(n<0){
            x = 1/x;
            n = -n;
        }
        return myPowChange(x,n);
    }

    public static void main(String[] args) {
        MyPow myPow = new MyPow();
        System.out.println(myPow.myPow(2, 4));
    }
}
