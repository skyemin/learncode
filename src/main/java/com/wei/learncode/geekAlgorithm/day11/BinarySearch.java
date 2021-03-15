package com.wei.learncode.geekAlgorithm.day11;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/3/9 14:43
 */
public class BinarySearch {

    public int binarySearch(int[] nums,int target){

        int left = 0,right = nums.length-1,mid;
        while(left <= right){
            mid = (right-left)/2 + left;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
    }
}
