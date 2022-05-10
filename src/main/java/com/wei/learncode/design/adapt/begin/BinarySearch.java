package com.wei.learncode.design.adapt.begin;

/**
 * @Author: skye
 * @Date: 2020/8/13 19:03
 * @Description: 二分查找
 * @Version:1.0
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(binarySearch(nums, 10));
    }

    public static Integer binarySearch(int[] nums,int num){

        int start = 0;
        int end = nums.length-1;
        int middle;
        while(start <= end){
            middle = (start+end)/2;
            if(nums[middle] == num){
                return middle;
            }
            if(nums[middle] > num){
                //在左边
                end = middle -1 ;
            }else{
                start = middle +1;
            }
        }
        return null;
    }
}
