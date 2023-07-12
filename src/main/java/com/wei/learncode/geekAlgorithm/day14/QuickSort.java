package com.wei.learncode.geekAlgorithm.day14;

import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] nums,int begin,int end){

        if(begin >= end){
            return;
        }
        int pivot = partition(nums,begin,end);
        quickSort(nums,begin,pivot-1);
        quickSort(nums,pivot+1,end);
    }

    private int partition(int[] nums, int begin, int end) {

        int pivot = end;
        //记录小于nums[pivot]次数
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if(nums[i] < nums[pivot]){
                int tmp = nums[counter]; nums[counter] = nums[i]; nums[i] = tmp;
                counter++;
            }
        }
        int tmp = nums[pivot]; nums[pivot] = nums[counter]; nums[counter] = tmp;
        return pivot;
    }

    public static void main(String[] args) {
        int[] array = {1,2,8,8,4};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
