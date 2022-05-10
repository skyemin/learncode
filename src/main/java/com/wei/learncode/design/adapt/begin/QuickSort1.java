package com.wei.learncode.design.adapt.begin;

import java.util.Arrays;

/**
 * @Author: skye
 * @Date: 2020/9/4 14:34
 * @Description:
 * @Version:1.0
 */
public class QuickSort1 {

    public static void main(String[] args) {

        QuickSort1 quickSort1 = new QuickSort1();
        int[] nums = {1,7,8,9,2,1,3,5,4};
        quickSort1.quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public void quickSort(int[] nums,int start,int end){
        if(start>=end){
            return ;
        }
        int pivot = partition(nums,start,end);
        quickSort(nums,start,pivot-1);
        quickSort(nums,pivot+1,end);
    }

    private int partition(int[] nums, int start, int end) {
        int pivot = end,counter = start;//counter用来统计有几个比pivot小
        for (int i = start; i < end; i++) {
            if(nums[i]<nums[pivot]){
                int tmp = nums[i];nums[i] = nums[counter];nums[counter] = tmp;
                counter++;
            }
        }
        int tmp = nums[counter];nums[counter] = nums[pivot];nums[pivot] = tmp;
        return counter;
    }
}
