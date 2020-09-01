package com.wei.learncode.begin;

/**
 * @Author: skye
 * @Date: 2020/9/1 17:16
 * @Description: 买卖股票的最佳时机  输入: [7,1,5,3,6,4]  * 输出: 5
 * @Version:1.0
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {


        int n = prices.length;
        if(n == 0) return 0;
        int[] a = new int[n];
        a[0] = 0;
        int max = 0; int min = prices[0];
        for (int i = 1; i < n; i++) {
            //前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
            a[i] = Math.max(a[i-1],prices[i] - min);
            max = Math.max(a[i],max);
            min = Math.min(min,prices[i]);
        }
        //a[i]表示第i天的最大收益
        //找重复性
        //定义状态
        //dp方程
        return max;
    }
}
