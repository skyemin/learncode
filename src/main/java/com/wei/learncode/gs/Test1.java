package com.wei.learncode.gs;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/9/7 19:35
 */
public class Test1 {

    public static void main(String[] args) {
        int b1, b2, b3;
        for(int m =100;m<1000;m++) {
            b3 = m / 100; // 百位数
            b2 = m % 100 / 10; // 十位数
            b1 = m % 10; // 个位数
            if((b3*b3*b3 + b2*b2*b2 + b1*b1*b1) == m ) {
                System.out.println(m+"是一个水仙花数");
            }
        }
    }
}
