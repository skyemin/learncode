package com.wei.learncode.algorithm;

import java.util.Arrays;

/**
 * @Author: weizz
 * @Date: 2019/8/20 17:03
 * @Description:
 * @Version:1.0
 */
public class TestInsert {

    public static void sort(int[] arr){

        for(int i=1;i<arr.length;i++){
            int insert = arr[i];
            int j = i-1;
            for(;j>=0;j--){
               if(insert<arr[j]){
                   arr[j+1] = arr[j];
               }
            }
            arr[j+1] = insert;
        }
    }

    public static void main(String[] args) {
        int[] array = {1,3,9,4,5,7,13};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
