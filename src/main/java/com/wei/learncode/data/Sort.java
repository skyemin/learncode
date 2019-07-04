package com.wei.learncode.data;

/**
 * @Author: weizz
 * @Date: 2019/6/10 10:17
 * @Description:
 * @Version:1.0
 */
public class Sort {

    public static void bubbleSort(int[] a){
        int n = a.length;
        if(n <= 1){
            return;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for(int j = 0;j < n -1;j++){
                if(a[j] > a[j+1]){
                    int value  = a[j];
                    a[j] = a[j+1];
                    a[j+1] = value;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        System.out.println(a.toString());
    }
    public static void insertionSort(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            // 查找插入的位置
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j+1] = a[j]; // 数据移动
                } else {
                    break;
                }
            }
            a[j+1] = value; // 插入数据
        }
    }
    public static void main(String[] args) {
        int[] a = {3,5,4,1,2,3};
        insertionSort(a,6);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
