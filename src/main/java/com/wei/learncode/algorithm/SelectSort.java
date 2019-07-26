package com.wei.learncode.algorithm;

/**
 * @Author: weizz
 * @Date: 2019/7/19 16:53
 * @Description: 选择排序
 * @Version:1.0
 */
public class SelectSort {
    public static void main(String[] args) {

        int[] num = {1,7,4,3,6,5};


    }
    public static void selectSort(int[] num){
        int[] aaa = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            int smallest = findSmallest(num);
            aaa[i] = num[smallest];
        }

    }
    public static int findSmallest(int[] num){
        int smallest = num[0];
        int index = 0;
        for (int i = 1; i < num.length; i++) {
            if(smallest > num[i]){
                smallest = num[i];
                index = i;
            }
        }
        return index;
    }
}
