package com.wei.learncode.begin;

import java.util.Arrays;

/**
 * @Author: skye
 * @Date: 2020/10/15 15:50
 * @Description:
 * @Version:1.0
 */
public class MergeSortArray {

    public static void main(String[] args) {
        int[] array1 = {1,3,5,7,9,13,17};
        int[] array2 = {2,4,6,8,10};
        int[] nums = mergeSortArray(array1,array2);
        System.out.println(Arrays.toString(nums));
    }
    private static int[] mergeSortArray(int[] array1, int[] array2) {
        int[] nums = new int[array1.length+array2.length];
        int i = 0,j = 0,k = 0;
        while(i<array1.length && j<array2.length){
            nums[k++] = array1[i]<=array2[j]?array1[i++]:array2[j++];
        }
        while(i<array1.length){
            nums[k++] = array1[i++];
        }
        while(j<array2.length){
            nums[k++] = array2[j++];
        }

        return nums;
    }
}
