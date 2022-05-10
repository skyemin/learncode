package com.wei.learncode.design.adapt.begin;

import java.util.Arrays;

/**
 * @author skye
 * @version 1.0
 * @description: 给你一个整数数组 A 和一个整数 K，请在该数组中找出两个元素，
 * 使它们的和小于 K 但尽可能地接近 K，返回这两个元素的和。如不存在这样的两个元素，请返回 -1。
 * @date 2021/3/30 13:52
 */
public class TwoSumLessThanK {

    public int twoSumLessThanK(int[] nums, int k) {

        if(nums.length == 0){
            return -1;
        }
        Arrays.sort(nums);
        int left =  0,right  = nums.length-1;
        int result = Integer.MIN_VALUE;
        while(left < right){
            if(nums[left]+nums[right]>k){
                right--;
            }else{
                result = Math.max(result,nums[left]+nums[right]);
                left++;
            }
        }
        return result == Integer.MIN_VALUE?-1:result;
    }

    public static void main(String[] args) {
        int[] nums = {34,23,1,24,75,33,54,8};
        int k = 60;
        TwoSumLessThanK twoSumLessThanK = new TwoSumLessThanK();
        System.out.println(twoSumLessThanK.twoSumLessThanK(nums, k));
    }
}
