package com.wei.learncode.geekAlgorithm.day3;

import java.util.*;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/25 13:55
 */
public class ThreeSum {

    //暴力解
   /* public List<List<Integer>> threeSum(int[] nums) {
        Set res = new HashSet();
        //List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> a  =new ArrayList<>();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[k]);
                        Collections.sort(a);
                        res.add(a);
                    }
                }
            }

        }
        return new ArrayList<>(res);
    }*/

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        //先把原数组排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                return lists;
            }
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int curr = nums[i];
            int left = i+1;
            int right = nums.length-1;
            while(left <right){
                int value = curr+nums[left]+nums[right];
                if(value == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(curr);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    lists.add(list);
                    while (left < right && nums[left]== nums[left+1]){
                        left++;
                    }
                    while (left < right && nums[right]== nums[right-1]){
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

    public static void main(String[] args) {
        int[] nums = {1,2,3,-1,-1,-3,0};
        ThreeSum threeSum = new ThreeSum();
        System.out.println(threeSum.threeSum(nums));
    }
}
