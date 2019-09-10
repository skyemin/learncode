package com.wei.learncode.algorithm;

import java.util.Arrays;

/**
 * @Author: weizz
 * @Date: 2019/8/27 14:11
 * @Description: 快排
 * @Version:1.0
 */
public class TestSort1 {

    //分成两份,返回中间索引
    public static int split(int[] arr,int left,int right){
        int pivot = arr[right];
        int temp;
        int i = left;
        for(int j = left;j<right;j++){
            if(arr[j] < pivot){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        arr[right] = arr[i];
        arr[i] = pivot;
        return i;
    }
    public static void quickSort(int[] arr,int left,int right){
        if(left<right){
            int center = split(arr, left, right);
            quickSort(arr,left,center-1);
            quickSort(arr,center+1,right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,3,4,7,2,5,1,10};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
