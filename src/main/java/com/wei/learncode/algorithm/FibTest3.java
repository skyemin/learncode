package com.wei.learncode.algorithm;

/**
 * Created by skye on 2019/1/21.
 * 动态规划的思想
 */
//1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144......
public class FibTest3 {

    public static int fib(int num) {
        if(num < 1){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        if(num == 2){
            return 2;
        }
        if(num == 3){
            return 4;
        }
        int a = 1;
        int b = 2;
        int c = 4;
        int temp = 0;
        for (int i = 4; i <= num; i++) {
            temp = a+b+c;
            a = b;
            b = c;
            c = temp;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
