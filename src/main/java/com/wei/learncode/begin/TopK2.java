package com.wei.learncode.begin;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/9 15:48
 */
public class TopK2 {

    public static void main(String[] args) {

        TopK2 topK2 = new TopK2();
        int[] array = {0,1,2,3,4,0,3,3,8,1,4,6,2,8,8,15,10,0,9,9,1,2,17,8,17,25,18,18,16,13,18,29,2,3,32,2,26,23,18,8,34,8,11,36,36,39,46,30,21,25,21,14,41,10,31,55,45,16,33,47,4,52,59,60,1,43,42,10,12,56,12,27,22,52,38,12,41,42,71,5,42,76,8,3,31,65,11,29,28,68,33,50,73,87,22,68,31,1,38,89};
        int[] leastNumbers = topK2.getLeastNumbers(array, 60);
        for (int leastNumber : leastNumbers) {
            System.out.println(leastNumber);
        }

    }

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        } else if (arr.length <= k) {
            return arr;
        }
        quickSort(arr,0,arr.length-1,k);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public void quickSort(int[] nums,int begin,int end,int k){

        if(begin >= end){
            return;
        }
        int m = partition(nums, begin, end);
        if (k == m) {
            // 正好找到最小的 k(m) 个数
            return ;
        } else if (k < m) {
            // 最小的 k 个数一定在前 m 个数中，递归划分
            quickSort(nums, begin, m-1,k);
        } else {
            // 在右侧数组中寻找最小的 k-m 个数
            quickSort(nums, m+1,end,k);
        }
    }

    public int partition(int[] nums, int begin, int end) {

        //快排不稳定,主要是因为pivot的选择{1,2,8,8,4},程序判断小于才交换位置,如果pivot为第二个8,第一个8就被交换到右边了
        int pivot = end;
        int counter = begin;  //记录小于nums[pivot]的个数
        for (int i = begin; i < end; i++) {
            if(nums[i] < nums[pivot]){
                int tmp = nums[counter];nums[counter] = nums[i];nums[i] = tmp;
                counter++;
            }
        }
        int tmp = nums[counter];nums[counter] = nums[pivot];nums[pivot] = tmp;
        return counter;
    }
}
