package com.wei.learncode.geekAlgorithm.day14;

public class MergeSortArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] tmp = new int[m+n];

        while (i < m && j < m){
            tmp[k++] = nums1[i] < nums2[j]?nums1[i++]:nums2[j++];
        }
        while (i < m){
            tmp[k++] = nums1[i++];
        }
        while (j < m){
            tmp[k++] = nums2[j++];
        }
        for (int l = 0; l < tmp.length; l++) {
            nums1[l] = tmp[l];
        }
    }

    public static void main(String[] args) {
        MergeSortArray mergeSortArray = new MergeSortArray();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        mergeSortArray.merge(nums1,m,nums2,n);
        System.out.println(1);
    }
}
