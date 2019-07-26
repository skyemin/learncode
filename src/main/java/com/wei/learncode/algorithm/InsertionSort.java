/*
 * Copyright 2018 Shanxi Lu'an Taihang Laihui Net Tech co.,LTD.
 */
package com.wei.learncode.algorithm;

import java.util.Arrays;

/**
 * Description:插入排序
 *
 * @author skye
 * @since: 1.0
 * Create Date Time: 2018/11/26 10:34
 * Update Date Time:
 */
public class InsertionSort {
    // 插入排序，a 表示数组，n 表示数组大小（从小到大进行排序）
     public static void insertionSort(int[] a, int n) {
         //如果数组大小为 1 直接返回
         if (n <= 1) return;
         //否则进行插入排序
         for (int i = 1; i < n; i++) {
             //value为本次循环待插入有序列表中的数
             int value = a[i];
             int j = i - 1;
             // 查找插入的位置
             for (; j >= 0; j--) {
                 if (a[j] > value) {
                     a[j + 1] = a[j];  // 数据移动
                 } else {
                     break;
                 }
             }
             a[j + 1] = value; // 插入数据
         }
      }
    public static void main(String[] args) {
        int[] array = {2,3,1,4,5,12,1,8};
        insertionSort(array,array.length);
        System.out.println(Arrays.toString(array));
    }
}
