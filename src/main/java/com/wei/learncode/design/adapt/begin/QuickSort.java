package com.wei.learncode.design.adapt.begin;

import java.util.Arrays;

/**
 * @Author: skye
 * @Date: 2020/8/17 12:34
 * @Description:
 * @Version:1.0
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {1,7,8,9,2,1,3,5,4};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }


    public static void quickSort(int[] array,int begin,int end){

        if(begin >= end){
            return;
        }
        //得到一个索引,左边数据都小于他,右边数据都大于他
        int pivot = partition(array,begin,end);
        quickSort(array,begin,pivot-1);
        quickSort(array,pivot+1,end);

    }

    private static int partition(int[] array, int begin, int end) {

        int pivot = end;
        int counter = begin;//小于pivot元素的个数
        for (int i = begin; i < end; i++) {
            if(array[i] < array[pivot]){
                int tmp = array[i]; array[i] = array[counter]; array[counter] = tmp;
                counter++;
            }
        }
        int tmp = array[pivot]; array[pivot] = array[counter]; array[counter] = tmp;
        return counter;
    }
}
