package com.wei.learncode.geekAlgorithm.day0715;

public class FindMin {

    public int findMin(int[] nums) {
        int begin = 0;
        int end = nums.length-1;
        while(begin < end){
            int mid = (begin+end)/2;
            if(nums[mid] < nums[end]){
                end = mid;
            }else{
                begin = mid + 1;
            }
        }
        return nums[begin];
    }
}
