package com.wei.learncode.sort;

import java.util.Arrays;

/**
 * @Author: skye
 * @Date: 2019/12/16 16:09
 * @Description:
 * @Version:1.0
 */
public class InsertSort {

    public static void sort(int[] array){
        for(int i=1;i<array.length;i++){
            int insert = array[i];
            int j = i-1;
            System.out.println(j);
            //遍历已经排好序的数组,不用一个个交换,只需要将值往后挪一位

            for(;j>=0 && insert<array[j];j--){
                array[j+1] = array[j];
            }
            array[j+1] = insert;
        }
    }
    public static void main(String[] args) {

        int[] array = {5,8,6,3,9,2,1,7};
        sort(array);
    }
}
