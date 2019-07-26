/*
 * Copyright 2018 Shanxi Lu'an Taihang Laihui Net Tech co.,LTD.
 */
package com.wei.learncode.algorithm;

/**
 * Description:
 *
 * @author wzz
 * @since: 1.0
 * Create Date Time: 2018/11/26 11:15
 * Update Date Time:
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int i = binarySearch(arr, 4);
        System.out.println(i);
    }
    //二分查找算法
    public static int binarySearch(int[] arr,int num){

        int low=0;
        int upper=arr.length-1;
        while(low<=upper){
            int mid=(upper+low)/2;
            if(arr[mid]<num){
                low=mid+1;
            }
            else if(arr[mid]>num){
                upper=mid-1;
            }
            else
                return mid;
        }
        return -1;
    }
}
