package com.wei.learncode.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author skye
 * @version 1.0
 * @description: 最长连续序列 https://leetcode-cn.com/problems/longest-consecutive-sequence/
 * @date 2021/8/3 14:20
 */
public class LongestConsecutive {

    Set<Integer> set = new HashSet<>();
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0){
            return 0;
        }
        int max = 1;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if(!set.contains(num-1)){
                int cur = num;
                int count = 1;
                while(set.contains(cur+1)){
                    cur++;
                    count++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LongestConsecutive longestConsecutive = new LongestConsecutive();
        System.out.println(longestConsecutive.longestConsecutive(new int[]{1,2,3,4,7}));
    }
}
