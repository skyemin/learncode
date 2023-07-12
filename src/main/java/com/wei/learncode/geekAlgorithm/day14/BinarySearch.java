package com.wei.learncode.geekAlgorithm.day14;

public class BinarySearch {

    public static int search(int[] nums, int target){

        int begin = 0;
        int end = nums.length-1;
        int mid;
        while(begin <= end){
            mid = (begin+end)/2;
            if(nums[mid] < target){
                begin = mid+1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int i = search(arr, 7);
        System.out.println(i);
    }
}
