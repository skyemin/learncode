package com.wei.learncode.geekAlgorithm.day14;


import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int[] nums,int begin,int end) {

        if(begin >= end){
            return;
        }
        int mid = (begin + end) / 2;
        mergeSort(nums,begin,mid);
        mergeSort(nums,mid+1,end);
        merges(nums,begin,mid,end);


    }

    private void merges(int[] nums, int begin, int mid, int end) {
        int[] tmp = new int[end-begin+1];
        int i = begin;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= end){
            tmp[k++] = nums[i] < nums[j]?nums[i++]:nums[j++];
        }
        while(i <= mid){
            tmp[k++] = nums[i++];
        }
        while(j <= end){
            tmp[k++] = nums[j++];
        }
        for (int l = 0; l < tmp.length; l++) {
            nums[begin+l] = tmp[l];
        }
    }
    public static void main(String[] args) {
        int[] array = {1,7,8,9,2,1,3,5,4};
        MergeSort mergeSort =  new MergeSort();
        mergeSort.mergeSort(array,0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
