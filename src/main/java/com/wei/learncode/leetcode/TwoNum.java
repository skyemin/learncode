package com.wei.learncode.leetcode;

/**
 * @Author: weizz
 * @Date: 2019/9/25 14:19
 * @Description: 给定 nums = [2, 7, 11, 15], target = 9,因为 nums[0] + nums[1] = 2 + 7 = 9,所以返回 [0, 1]
 *
 */
public class TwoNum {

    public static int[] twoNum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] == target-nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] ints = twoNum(nums, 17);
        System.out.println(1);
    }
}
