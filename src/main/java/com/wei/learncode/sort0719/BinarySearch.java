package com.wei.learncode.sort0719;

public class BinarySearch {

    public static int search(int[] nums,int target){
        int min = 0;
        int max = nums.length;
        while(min <= max){
            int i = (max + min) / 2;
            if(target > nums[i]){
                min = i+1;
            }else if(target < nums[i]){
                max = i-1;
            }else{
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int i = search(arr, 1);
        System.out.println(i);
    }
}
