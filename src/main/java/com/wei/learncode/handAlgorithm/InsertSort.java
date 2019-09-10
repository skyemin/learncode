package com.wei.learncode.handAlgorithm;

import java.util.Arrays;

/**
 * @Author: weizz
 * @Date: 2019/8/28 10:52
 * @Description: 插入排序
 * @Version:1.0
 */
public class InsertSort {

    //int[] arr = {34,8,64,51,32}
    public static void insertSort(int[] arr){

        int j;
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            for(j = i;j>0&&arr[j-1]>temp;j--){
                arr[j] = arr[j-1];
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {34,8,64,51,32};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
