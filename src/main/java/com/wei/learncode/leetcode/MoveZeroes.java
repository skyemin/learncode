package com.wei.learncode.leetcode;

/**
 * @Author: weizz
 * @Date: 2019/9/19 18:25
 * @Description: 移动0
 * @Version:1.0   [0,1,0,3,12]  -> [1,3,12,0,0]
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int count= 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                count++;
            }else{
                nums[i-count] = nums[i];
            }
        }
        for (int i=nums.length-count;i<nums.length;i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0};
        moveZeroes(nums);
    }
}
