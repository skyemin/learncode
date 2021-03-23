package com.wei.learncode.geekAlgorithm.day11;

/**
 * @author skye
 * @version 1.0
 * @description:  [2,2,2,0,1]
 * @date 2021/3/22 15:49
 */
public class FindMinRepeat {

    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length-1;
        while (left < right){
            int mid = left + ((right-left) >> 1);
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }else if(nums[mid] < nums[right]){
                right = mid;
            }else{
                right--;
            }
        }
        return nums[left];
    }
}
