package com.wei.learncode.begin;

import java.util.Arrays;

/**
 * @Author: skye
 * @Date: 2020/8/17 13:07
 * @Description:
 * @Version:1.0
 */
public class MergeSort {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,7,5,18,9,100,80,25};
        mergeSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void mergeSort(int[] nums,int left,int right){
        if(left>=right){
            return;
        }
        //>>1 == /2
        int mid = (left+right) >> 1;
        mergeSort(nums,left,mid);
        mergeSort(nums,mid+1,right);
        merge(nums,left,mid,right);
    }

    private static void merge(int[] nums, int left, int mid, int right) {

        int[] tmp = new int[right-left+1];
        int i = left,j = mid + 1,k = 0;
        while(i<=mid && j<=right){
            tmp[k++] = nums[i] <= nums[j]?nums[i++]:nums[j++];
        }

        while(i<=mid){
            tmp[k++] = nums[i++];
        }
        while(j<=right){
            tmp[k++] = nums[j++];
        }
        for (int p = 0; p < tmp.length; p++) {
            nums[left+p] = tmp[p];
        }
    }
}
