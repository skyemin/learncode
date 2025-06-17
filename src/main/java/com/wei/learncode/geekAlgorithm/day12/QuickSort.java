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
        //假设我们有数组：[4(1), 2, 4(2), 1, 3]，其中4(1)和4(2)表示两个值都是4但在原始数组中的位置不同的元素。
        //
        //现在我们用这个快速排序算法排序：
        //
        //选择最后一个元素3作为枢轴
        //遍历数组，将小于3的元素放到数组前面：
        //当检查到2和1时，它们都小于3，所以会被交换到前面
        //经过第一次partition后，数组可能变成：[2, 1, 4(1), 4(2), 3]
        //然后，将枢轴元素3与其正确位置的元素交换
        //假设counter = 2，数组变成：[2, 1, 3, 4(2), 4(1)]
        //注意，4(1)和4(2)的相对顺序已经改变，这就是不稳定性的体现。
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
        int[] array = {1,2,8,8,4};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
