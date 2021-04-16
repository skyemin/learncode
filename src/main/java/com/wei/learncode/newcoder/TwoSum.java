package com.wei.learncode.newcoder;

import java.util.HashMap;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/12 18:10
 */
public class TwoSum {

    public int[] twoSum (int[] numbers, int target) {

        HashMap map = new HashMap();
        for (int i = 0; i < numbers.length; i++) {
            if(map.containsKey(target-numbers[i])){
                return new int[] {(int) map.get(target-numbers[i]),i+1};
            }
            map.put(numbers[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();
        twoSum.twoSum(new int[] {3,2,4},6);
    }
}
