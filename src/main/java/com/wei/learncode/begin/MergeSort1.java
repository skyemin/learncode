package com.wei.learncode.begin;

import java.util.Arrays;

/**
 * @Author: skye
 * @Date: 2020/9/4 15:49
 * @Description:
 * @Version:1.0
 */
public class MergeSort1 {

    public static void main(String[] args) {
        MergeSort1 mergeSort1 = new MergeSort1();
        int[] nums = {1,7,8,9,2,1,3,5,4};
        mergeSort1.mergeSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public void mergeSort(int[]nums,int begin,int end){

        if(begin >= end){
            return;
        }
        int mid = (begin+end) >> 1;
        mergeSort(nums,begin,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,begin,mid,end);
    }

    private void merge(int[] nums, int begin, int mid, int end) {
        int[] tmps = new int[end-begin+1];
        int i=begin,j=mid+1,k=0;
        while(i<=mid && j<=end){
            tmps[k++] = nums[i]<=nums[j]?nums[i++]:nums[j++];
        }
        while(i<=mid){
            tmps[k++] = nums[i++];
        }
        while(j<=end){
            tmps[k++] = nums[j++];
        }
        for (int l = 0; l < tmps.length; l++) {
            nums[begin+l] = tmps[l];
        }
    }
}
