package com.wei.learncode.geekAlgorithm.day5.time1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/2/22 16:29
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}
