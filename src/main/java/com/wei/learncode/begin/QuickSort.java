package com.wei.learncode.begin;

import java.util.Arrays;

/**
 * @Author: skye
 * @Date: 2020/8/17 12:34
 * @Description:
 * @Version:1.0
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,7,5,18,9,100,80,25};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }


    public static void quickSort(int[] array,int begin,int end){

        if(begin >= end){
            return;
        }
        int pivot = partition(array,begin,end);
        quickSort(array,begin,pivot-1);
        quickSort(array,pivot+1,end);

    }

    private static int partition(int[] array, int begin, int end) {

        int pivot = end;
        int counter = begin;
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
