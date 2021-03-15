package com.wei.learncode.geekAlgorithm.day11;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/3/10 11:26
 */
public class SelfSort {

    private int selfSort(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int mid;
        while (left <= right) {
            mid = (right + left) / 2;
            if (nums[mid] > nums[mid+1] && nums[mid] < nums[mid-1]) {
                right = mid - 1;
            }else if(nums[mid] < nums[mid+1] && nums[mid] > nums[mid-1]){
                left = mid + 1;
            }else if(nums[mid] < nums[mid+1] && nums[mid] < nums[mid-1]){
                right = mid - 1;
            }
            //特殊情况
            else{
                return mid;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        SelfSort selfSort = new SelfSort();
        System.out.println(selfSort.selfSort(new int[]{4, 5, 6, 7, 8, 1, 2}));
    }
}
