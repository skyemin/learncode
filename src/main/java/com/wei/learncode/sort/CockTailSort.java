package com.wei.learncode.sort;

import java.util.Arrays;

/**
 * @Author: skye
 * @Date: 2019/12/16 17:53
 * @Description: 鸡尾酒排序(适用于大多数元素有序的情况)
 * @Version:1.0
 */
public class CockTailSort {

    private static void sort(int array[])
    {
        int tmp  = 0;
        //记录右侧最后一次交换的位置
        int lastRightExchangeIndex = 0;
        //记录左侧最后一次交换的位置
        int lastLeftExchangeIndex = 0;
        //无序数列的右边界，每次比较只需要比到这里为止
        int rightSortBorder = array.length - 1;
        //无序数列的左边界，每次比较只需要比到这里为止
        int leftSortBorder = 0;
        for(int i=0; i<array.length/2; i++)
        {
            //有序标记，每一轮的初始是true
            boolean isSorted = true;
            //奇数轮，从左向右比较和交换
            for(int j=leftSortBorder; j<rightSortBorder; j++)
            {
                if(array[j] > array[j+1])
                {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    //有元素交换，所以不是有序，标记变为false
                    isSorted = false;
                    lastRightExchangeIndex = j;
                }
            }
            rightSortBorder = lastRightExchangeIndex;
            if(isSorted){
                break;
            }
            //偶数轮之前，重新标记为true
            isSorted = true;
            //偶数轮，从右向左比较和交换
            for(int j=rightSortBorder; j>leftSortBorder; j--)
            {
                if(array[j] < array[j-1])
                {
                    tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                    //有元素交换，所以不是有序，标记变为false
                    isSorted = false;
                    lastLeftExchangeIndex = j;
                }
            }
            leftSortBorder = lastLeftExchangeIndex;
            if(isSorted){
                break;
            }
        }
    }
    public static void main(String[] args){
        int[] array = new int[]{2,3,4,5,6,7,8,1};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
