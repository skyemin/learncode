package com.wei.learncode.sort0713;

/**
 * @Author: skye
 * @Date: 2020/7/13 16:32
 * @Description:
 * @Version:1.0
 */
public class BinarySearch {

    public static int search(int[] nums,int num){

        int min = 0;
        int max = nums.length;
        while (min <= max){
            int i = (max+min)/2;
            if(num>nums[i]){
                min = i+1;
            }else if(num < nums[i]){
                max = i-1;
            }else{
                return  i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int i = search(arr, 8);
        System.out.println(i);
    }
}
