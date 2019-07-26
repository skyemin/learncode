package com.wei.learncode.algorithm;

/**
 * 爬楼梯问题
 */
public class FibTest {

    //假设你正在爬楼梯，楼梯有 n 级。每次你只能爬1级或者2级或者3级，那么你有多少种方法爬到楼梯的顶部？
    //思路:楼梯10级,假设还差最后一步到达,有三种情况,7-10,8-10,9-10 f(10) = f(9)+f(8)+f(7)
    //时间复杂度:O(2^N)
    public static int fib(int num){
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
        return fib(num-3)+fib(num-2)+fib(num-1);
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int fib = fib(7);
        System.out.println(fib);
        long endTime = System.currentTimeMillis();
        System.out.println("消耗时间:"+(endTime-startTime));
    }
}
