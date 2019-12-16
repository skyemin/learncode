package com.wei.learncode.sort;

import java.util.Arrays;

/**
 * @Author: skye
 * @Date: 2019/12/16 14:47
 * @Description: 冒泡排序  O(N^2) 稳定
 * @Version:1.0
 */
public class BubbleSort {

    public static void sort(int[] array){
        int temp;
        //第二次优化,记录最后一次交换的位置
        int lastExchangeIndex = 0;
        //记录边界
        int border = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            //第一次优化,加一个标识,在有序的时候直接跳出循环,不用在数组有序的情况下继续遍历
            boolean flag = true;
            //-1是为了防止索引越界  -i是每次遍历后最后一位都是最大,可以少判断一次
            /*for(int j = 0; j< array.length-i-1;j++){*/
            for(int j = 0; j< border;j++){
                //如果左边比右边大交换位置
                if(array[j]>array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    //发生元素交换 说明还是无序
                    flag = false;
                    //记录有序数组的边界
                    lastExchangeIndex = j;
                }
            }
            border = lastExchangeIndex;
            if(flag){
                break;
            }
        }
    }

    public static void main(String[] args) {
        //int[] array = {5,8,6,3,9,2,1,7};
        //这种数据,最后几位已经是有序
        int[] array = {9,4,2,1,5,6,7,8};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
