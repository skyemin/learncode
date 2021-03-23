package com.wei.learncode.geekAlgorithm.day11;

/**
 * @author skye
 * @version 1.0
 * @description:  https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/
 * @date 2021/3/22 15:37  [4,5,6,7,0,1,2]
 */
public class FindMinNoRepeat {

    //最左边界无重复值
    public int findMin(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }
        int left = 0;
        int right = nums.length-1;
        while (left < right){
            int mid = left + ((right-left) >> 1);
            if(nums[mid] > nums[nums.length-1]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}
