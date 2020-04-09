package com.wei.learncode.sort;

import java.util.Arrays;

/**
 * @Author: skye
 * @Date: 2019/12/17 14:59
 * @Description: 希尔排序  O(N^2)  不稳定
 * @Version:1.0
 */
public class ShellSort {

    public static void sort(int [] array){
        //希尔排序的增量
        int d=array.length;
        while(d>1) {
            //使用希尔增量的方式，即每次折半
            d=d/2;
            for(int x=0;x<d;x++) {
                for(int i=x+d;i<array.length;i=i+d) {
                    int temp=array[i];
                    int j;
                    for(j=i-d;j>=0&&array[j]>temp;j=j-d) {
                        array[j+d]=array[j];
                    }
                    array[j+d]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {5,8,6,3,9,2,1,7};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
