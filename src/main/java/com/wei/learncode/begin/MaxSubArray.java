package com.wei.learncode.begin;

/**
 * @Author: skye
 * @Date: 2020/8/31 20:45
 * @Description: [-2,1,-3,4,-1,2,1,-5,4]   最大子序和
 * @Version:1.0
 * https://leetcode-cn.com/problems/maximum-subarray/solution/zheng-li-yi-xia-kan-de-dong-de-da-an-by-lizhiqiang/
 */
public class MaxSubArray {


    public static void main(String[] args) {
        MaxSubArray maxSubArray = new MaxSubArray();
        System.out.println(maxSubArray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
    public int maxSubArray(int[] nums) {

        /*if(nums == null) return 0;
        int[] dp = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            if(dp[i-1]>0){
                dp[i] = dp[i-1]+nums[i];
            }else{
                dp[i] = nums[i];
            }
        }
        int tmp = dp[0];
        for (int i = 1; i < dp.length; i++) {
            tmp = Math.max(dp[i],tmp);
        }
        return tmp;*/

        int max = nums[0];
        //存储中间值
        int tmpMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(tmpMax<0){
                tmpMax = nums[i];
            }else{
                tmpMax = nums[i]+tmpMax;
            }
            max = Math.max(tmpMax,max);
        }
        return max;
    }
}
