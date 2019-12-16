package com.wei.learncode.sort;

import javax.xml.ws.soap.Addressing;
import java.util.Arrays;

/**
 * @Author: skye
 * @Date: 2019/12/16 15:30
 * @Description: 选择排序 O(N^2)  不稳定
 * @Version:1.0
 */
public class SelectSort {

    public static void sort(int[] array){

        for (int i = 0; i < array.length; i++) {
            //定义最小值的索引
            int minIndex = i;
            for(int j = i+1; j < array.length; j++){
                minIndex = array[j]>array[minIndex]?minIndex:j;
            }
            //和最小值更换位置
           /* int temp = 0;
            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;*/
           if(i != minIndex){
               array[i] = array[i] ^ array[minIndex];
               array[minIndex] = array[i] ^ array[minIndex];
               array[i] = array[i] ^ array[minIndex];
           }
        }
    }
    public static void main(String[] args) {
        int[] array = {5,8,6,3,9,2,1,7};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
