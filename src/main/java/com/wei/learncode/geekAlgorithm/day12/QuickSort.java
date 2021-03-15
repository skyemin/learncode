package com.wei.learncode.geekAlgorithm.day12;

import java.util.Arrays;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/3/15 11:16
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

    public int partition(int[] nums, int begin, int end) {

        //快排不稳定,主要是因为pivot的选择{1,2,8,8,4},程序判断小于才交换位置,如果pivot为第二个8,第一个8就被交换到右边了
        int pivot = end;
        int counter = begin;  //记录小于nums[pivot]的个数
        for (int i = begin; i < end; i++) {
            if(nums[i] < nums[pivot]){
                int tmp = nums[counter];nums[counter] = nums[i];nums[i] = tmp;
                counter++;
            }
        }
        int tmp = nums[counter];nums[counter] = nums[pivot];nums[pivot] = tmp;
        return counter;
    }

    public static void main(String[] args) {
        int[] array = {1,7,8,9,2,1,3,5,4};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
