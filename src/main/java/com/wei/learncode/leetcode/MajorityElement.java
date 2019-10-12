package com.wei.learncode.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: weizz
 * @Date: 2019/9/18 17:10
 * @Description: 求众数
 * @Version:1.0
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if(map.get(num) != null){
                int count = map.get(num)+1;
                map.put(num,count);
            }else{
                map.put(num,1);
            }
        }
        int num = nums.length/2;
        for (Integer integer : map.keySet()) {
            if(map.get(integer)>num){
                return integer;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
