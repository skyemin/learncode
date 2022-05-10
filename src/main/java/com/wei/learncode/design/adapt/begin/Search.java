package com.wei.learncode.design.adapt.begin;

/**
 * @Author: skye
 * @Date: 2020/8/14 9:59
 * @Description:  [4,5,6,7,0,1,2]
 * @Version:1.0
 */
public class Search {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 0));
    }

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
        int middle;

        while(start <= end){
            middle = (start + end)/2;
            if(nums[middle] == target){
                return middle;
            }
            if(nums[middle]>nums[start]){

            }
        }

        return -1;
    }

}
