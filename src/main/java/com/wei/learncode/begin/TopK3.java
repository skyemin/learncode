package com.wei.learncode.begin;

import java.util.ArrayList;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/9 16:23
 */
public class TopK3 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        if(input==null || k<=0 || k>input.length)
            return list;
        quickSort(input,0,input.length-1,k);
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    public void quickSort(int[] nums,int begin,int end,int k){

        if(begin >= end){
            return;
        }
        int m = partition(nums, begin, end);
        if (k == m) {
            // 正好找到最小的 k(m) 个数
            return ;
        } else if (k < m) {
            // 最小的 k 个数一定在前 m 个数中，递归划分
            quickSort(nums, begin, m-1,k);
        } else {
            // 在右侧数组中寻找最小的 k-m 个数
            quickSort(nums, m+1,end,k);
        }
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
}
