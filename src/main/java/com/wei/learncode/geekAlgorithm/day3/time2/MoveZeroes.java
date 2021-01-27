package com.wei.learncode.geekAlgorithm.day3.time2;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/26 18:49
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
        //快排思想 两边交换,不等于0的在左边,等于0的在右边
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
    }
}
