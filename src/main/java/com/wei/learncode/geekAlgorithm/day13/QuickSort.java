package com.wei.learncode.geekAlgorithm.day13;

import java.util.Arrays;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/8/6 10:25
 */
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
        int counter = begin;
        for (int i = begin; i < end; i++) {
            //{1,2,3,2}  快排不稳定
            if(nums[i] < nums[pivot]){
                int tmp = nums[counter];nums[counter] = nums[i];nums[i] = tmp;
                counter++;
            }
        }
        int tmp = nums[counter];nums[counter] = nums[pivot];nums[pivot] = tmp;
        return counter;
    }

    public static void main(String[] args) {
        int[] array = {5,4,3,1,2};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
