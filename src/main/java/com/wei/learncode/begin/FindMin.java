package com.wei.learncode.begin;

/**
 * @Author: skye
 * @Date: 2020/8/14 10:53
 * @Description:
 * @Version:1.0
 */
public class FindMin {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,9,1,2};
        System.out.println(findMin(nums));
    }
   /* public static int findMin(int[] nums) {
        if(nums.length ==1){
            return nums[0];
        }
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]>nums[i+1]){
                return nums[i+1];
            }
        }
        return nums[0];
    }*/
       public static int findMin(int[] nums) {

           int start = 0;
           int end = nums.length-1;
           int middle;
           while(start < end){
               middle = start+(end-start)/2;
               if(nums[middle]>nums[end]){
                   start = middle + 1;
               }else{
                   end = middle ;
               }
           }
           return nums[start];
       }

}
