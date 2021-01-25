package com.wei.learncode.geekAlgorithm.day3;

import java.util.Arrays;

/**
 * @author skye
 * @version 1.0
 * @description:  https://leetcode-cn.com/problems/move-zeroes/
 * @date 2021/1/25 11:21
 */
public class MoveZeroes {

    //两次遍历法
    /*public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }*/

    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
