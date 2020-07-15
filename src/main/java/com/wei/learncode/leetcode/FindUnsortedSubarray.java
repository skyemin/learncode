package com.wei.learncode.leetcode;

import java.util.Arrays;

/**
 * @Author: skye
 * @Date: 2020/6/28 17:44
 * @Description:  最短无序连续子数组
 * @Version:1.0
 */
public class FindUnsortedSubarray {

    public int findUnsortedSubarray(int[] nums) {


        int[] clone = nums.clone();
        //排序后的数组
        Arrays.sort(clone);

        int start = nums.length;
        int end = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != clone[i]){
                start = Math.min(i,start);
                end = Math.max(i,end);
            }
        }
        return (end - start >= 0 ? end - start + 1 : 0);
    }
}
