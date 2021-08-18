package com.wei.learncode.geekAlgorithm.day13;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/8/11 14:30
 */
public class BinarySearch {

    public int search(int[] nums,int target){

        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            //奇数个在正中间 偶数个在靠左位置
            int mid = left + ((right-left) >> 1);
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}
