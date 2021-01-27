package com.wei.learncode.geekAlgorithm.day3.time2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/27 10:28
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {

            if(nums[i] > 0){
                return lists;
            }
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int curr = nums[i];
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int value = curr+nums[left]+nums[right];
                if(value == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(curr);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    lists.add(list);
                    while (left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while (left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(value < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return lists;
    }
}
