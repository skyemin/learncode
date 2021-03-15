package com.wei.learncode.geekAlgorithm.day12;

import java.util.Arrays;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/3/15 12:03
 */
public class MergeSort {

    public void mergeSort(int[] nums,int begin,int end){

        if(begin >= end){
            return;
        }
        int mid = (begin + end) >> 1;
        mergeSort(nums,begin,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,begin,mid,end);
    }

    public void merge(int[] nums, int begin, int mid, int end) {

        int[] tmp = new int[end-begin+1];
        int i = begin;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end){
            tmp[k++] = nums[i] <=nums[j]?nums[i++]:nums[j++];
        }
        while (i <= mid){
            tmp[k++] = nums[i++];
        }
        while(j <= end){
            tmp[k++] = nums[j++];
        }
        for (int s = 0; s < tmp.length; s++) {
            nums[begin+s] = tmp[s];
        }
    }

    public static void main(String[] args) {
        int[] array = {1,7,8,9,2,1,3,5,4};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
