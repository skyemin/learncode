package com.wei.learncode.sort0713;

import java.util.Arrays;

/**
 * @Author: skye
 * @Date: 2020/7/15 10:39
 * @Description: 归并排序
 * @Version:1.0
 */
public class MergeSort {

    public static void sort(int[] array,int start,int end){
        if(start<end){
            //分成两个集合递归
            int mid = (start+end)/2;
            sort(array,start,mid);
            sort(array,mid+1,end);
            //把两个有序小集合归并成大集合
            merge(array,start,mid,end);
        }
    }

    public static void merge(int[] array,int start,int mid,int end){

        //开辟一个新的集合,创建3个指针
        int[] tmpArray =  new int[end-start+1];
        int p1=start,p2=mid+1,p=0;
        while (p1<=mid && p2<=end){
            //比较两个集合中的元素,小的放到新集合中
            if(array[p1]<=array[p2]){
                tmpArray[p++] = array[p1++];
            }else{
                tmpArray[p++] = array[p2++];
            }
        }
        //左边集合还有剩余
        while(p1<=mid){
            tmpArray[p++] = array[p1++];
        }
        //右边集合还有剩余
        while(p2<=end){
            tmpArray[p++] = array[p2++];
        }
        //把新集合的元素复制回原数组
        for (int i = 0; i < tmpArray.length; i++) {
            array[i+start] = tmpArray[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,7,6,5,3,2,8,1,9,100,200,50,1};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
