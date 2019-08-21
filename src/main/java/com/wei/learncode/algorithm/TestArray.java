package com.wei.learncode.algorithm;

/**
 * @Author: weizz
 * @Date: 2019/8/19 11:35
 * @Description:
 * @Version:1.0
 */
public class TestArray {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] newArr = new int[arr.length*2];

        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
        System.out.println(arr.length);
    }
}
