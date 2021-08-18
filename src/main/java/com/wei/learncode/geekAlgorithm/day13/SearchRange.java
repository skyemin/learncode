package com.wei.learncode.geekAlgorithm.day13;

/**
 * @author skye
 * @version 1.0
 * @description: 二分查找左边界
 * @date 2021/8/13 16:28
 */
public class SearchRange {

    public int[] searchRange(int[] nums, int target) {

       int[] res = new int[]{1,1};
       if(nums == null || nums.length == 0) return res;
       int left = 0;
       int right = nums.length-1;
       while(left <= right){
           int mid = left+((right-left)>>1);
           if(nums[mid]<target){
               left = mid+1;
           }else{
               right = mid;
           }
       }
       res[0] = nums[left] == target?left:-1;
       if(res[0] != -1){
           if(left == nums.length-1 || nums[left+1] != target){
               res[1] = left;
           }else{
               while (left < right) {
                   int mid = left + ((right - left) >> 1) + 1;
                   if (nums[mid] > target) {
                       right = mid - 1;
                   } else {
                       left = mid;
                   }
               }
               res[1] = right;
           }


       }
       return res;
    }
}
