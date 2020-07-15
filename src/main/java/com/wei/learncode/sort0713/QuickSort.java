package com.wei.learncode.sort0713;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author: skye
 * @Date: 2020/7/14 15:13
 * @Description: 快速排序O(NLogN)  不稳定
 * @Version:1.0
 */
public class QuickSort {


    public static int partition(int[] nums,int startIndex,int endIndex){

        //指针交换法
        //随机选举基准元素
        Random random = new Random();
        int randomIndex = random.nextInt(endIndex-startIndex+1)+startIndex;
        int randomTmp = nums[randomIndex];
        nums[randomIndex] = nums[startIndex];
        nums[startIndex] = randomTmp;

        int pivot = nums[startIndex];
        int left = startIndex;
        int right = endIndex;

        //{4,7,6,5,3,2,8,1}
        while(left != right){

            //当右指针大于基准值,右指针左移
            while(left<right && nums[right]>pivot){
                right--;
            }
            //当左指针小于基准值,左指针右移
            while(left<right && nums[left]<=pivot){
                left++;
            }
            //交换元素
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
        }
        //pivot和指针重合点交换
        nums[startIndex] = nums[left];
        nums[left] = pivot;
        return left;
    }

    public static void sort(int[] nums,int startIndex,int endIndex){
        if(startIndex >= endIndex){
            return;
        }
        int partition = partition(nums, startIndex, nums.length - 1);
        sort(nums,startIndex,partition-1);
        sort(nums,partition+1,endIndex);
    }
    public static void main(String[] args) {
        int[] nums = {4,7,6,5,3,2,8,1,9,100,200,50,1};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
