package com.wei.learncode.geekAlgorithm.day3.time4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/9/8 17:21
 */
public class ThreeNum {

    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int left = nums[i+1];
            int right = nums.length-1;
            while(left < right){
                int value = curr+left+right;
                if(value == 0){
                    List list = new ArrayList(3);
                    list.add(curr);
                    list.add(left);
                    list.add(right);
                    lists.add(list);
                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right-1]){
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
