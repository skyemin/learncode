package com.wei.learncode.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: skye
 * @Date: 2020/6/16 10:44
 * @Description:
 * @Version:1.0
 */
public class FindDisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            boolean flag = true;
            for (int j = 0; j < nums.length; j++) {
                if(i == nums[j]){
                    flag = false;
                }
            }
            if(flag){
                list.add(i);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> list = findDisappearedNumbers(nums);
        list.forEach(lang -> System.out.println(lang));
    }
}
