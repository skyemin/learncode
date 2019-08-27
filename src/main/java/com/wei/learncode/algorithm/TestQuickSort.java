package com.wei.learncode.algorithm;

import java.util.Arrays;

/**
 * @Author: weizz
 * @Date: 2019/8/26 16:06
 * @Description:
 * @Version:1.0
 */
public class TestQuickSort {

    //分割操作：方法一，单向调整
    static int partion(int a[], int left, int right)
    {
        int temp,pivot;//pivot存放主元
        int i,j;
        i = left;
        pivot = a[right];
        for(j = left;j < right;j++)
        {
            if(a[j] < pivot)
            {  //交换值
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }
        a[right] = a[i];
        a[i] = pivot;
        return i;//把主元的下标返回
    }
    //快速排序
    static void QuickSort(int a[], int left, int right)
    {
        int center;
        if(left < right)
        {
            center = partion(a,left,right);
            QuickSort(a,left,center-1);//左半部分
            QuickSort(a,center+1,right);//右半部分
        }
    }

    public static void main(String[] args) {
        int[] a = {8,1,3,2,7,6,4};
        QuickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
