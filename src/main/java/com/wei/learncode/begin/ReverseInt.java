package com.wei.learncode.begin;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/7 16:52
 */
public class ReverseInt {

    public int reverse(int x) {

        long n = 0;
        while (x !=0){
            n = n*10 + x%10;
            x = x/10;
        }
        return (int) n == n?(int)n:0;
    }

    public static void main(String[] args) {
        ReverseInt reverseInt = new ReverseInt();
    }
}
