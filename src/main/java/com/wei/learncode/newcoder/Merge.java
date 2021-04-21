package com.wei.learncode.newcoder;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/21 18:15
 */
public class Merge {

    public void merge(int A[], int m, int B[], int n) {

        int i = m-1;
        int j = n-1;
        while(i>=0 && j>=0){
            A[i+j+1] = A[i]>B[j]?A[i--]:B[j--];
        }
        while(j>=0) A[j] = B[j--];
    }
}
