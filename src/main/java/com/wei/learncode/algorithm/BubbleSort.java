/*
 * Copyright 2018 Shanxi Lu'an Taihang Laihui Net Tech co.,LTD.
 */
package com.wei.learncode.algorithm;

import java.util.Arrays;

/**
 * Description:冒泡排序
 *
 * @author skye
 * @since: 1.0
 * Create Date Time: 2018/11/26 9:23
 * Update Date Time:
 */
public class BubbleSort {

    //基础冒泡排序
    private static void sort1(int[] array){
        int temp = 0;
        //外面循环控制次数,每次循环将最大数放到最右边,每执行一次,有序次数+1
        for(int i=0;i<array.length;i++){
            //内部循环是每一次的比较
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    private static void sort2(int[] array){
        int temp = 0;
        for(int i=0;i<array.length;i++){
            boolean flag = true;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    //有元素交换，所以不是有序，标记变为false
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }
    private static void sort3(int[] array){
        int temp = 0;
        //无序数列的边界，每次比较只需要比到这里为止
        int sortBorder  =array.length-1;
        //记录最后一次交换的位置
        int lastChangeIndex = 0;
        for(int i=0;i<array.length;i++){
            //有序标记，每一轮的初始是true
            boolean flag = true;
            for(int j=0;j<sortBorder;j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
                    //把无序数列的边界更新为最后一次交换元素的位置
                    lastChangeIndex = j;
                }
            }
            sortBorder = lastChangeIndex;
            if(flag){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {2,3,1,4,5,6,7,8};
        sort3(array);
        System.out.println(Arrays.toString(array));
    }
}
