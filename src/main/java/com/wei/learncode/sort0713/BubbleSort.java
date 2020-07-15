package com.wei.learncode.sort0713;

import java.util.Arrays;

/**
 * @Author: skye
 * @Date: 2020/7/13 15:55
 * @Description:
 * @Version:1.0
 */
public class BubbleSort {

    //5,8,6,3,9,2,1,7
    public static void sort(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            int border = nums.length -1 - i;
            int lastChangeIndex = 0;
            boolean flag = true;
            for (int j = 0; j < border; j++) {
                if(nums[j] > nums[j+1]){
                    //交换位置
                    int tmp  = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                    //发生了元素交换
                    flag = false;
                    lastChangeIndex = j;
                }
            }
            border = lastChangeIndex;
            if(flag){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,8,6,3,9,2,1,7};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
