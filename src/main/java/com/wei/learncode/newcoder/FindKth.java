package com.wei.learncode.newcoder;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/26 18:16
 */
public class FindKth {

    public int findKth(int[] a, int n, int K) {
        if(a==null || K<=0 || K>n)
            return -1;
        return quickSort(a,0,n-1,K);
    }

    public int quickSort(int[] nums,int begin,int end,int k){

        if(begin > end){
            return -1;
        }
        int m = partition(nums, begin, end);
        if (m == nums.length - k) {
            return nums[m];
        } else if (m < nums.length - k) {
            return quickSort(nums, m+1,end,k);
        } else {
            return quickSort(nums, begin, m-1,k);
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

    public static void main(String[] args) {
        FindKth findKth = new FindKth();
        System.out.println(findKth.findKth(new int[]{1,3,5,2,2,7,8,0,50,1,6,12,60},13,3));
    }
}
