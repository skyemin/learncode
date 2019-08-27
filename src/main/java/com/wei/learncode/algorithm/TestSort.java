package com.wei.learncode.algorithm;

import java.util.Arrays;

/**
 * @Author: weizz
 * @Date: 2019/8/27 10:49
 * @Description:
 * @Version:1.0
 */
public class TestSort {

    //   int[] a = {8,1,3,2,7,6,4};
    public static int partion(int[] array,int first,int end){
        int temp;
        int pivot;
        int i = first;
        pivot = array[end];
        for(int j=first;j<end;j++){
            if(array[j] < pivot){
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
            }
        }
        array[end] = array[i];
        array[i] = pivot;
        return i;
    }

    public static void quickSort(int[] array,int first,int end){
        int center;
        if(first<end){
            center = partion(array, first, end);
            quickSort(array,first,center-1);
            quickSort(array,center+1,end);
        }
    }
    public static void main(String[] args) {
        int[] a = {8,1,3,2,7,6,4};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
