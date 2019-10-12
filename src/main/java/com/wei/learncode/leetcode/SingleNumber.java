package com.wei.learncode.leetcode;

import java.util.HashSet;
import java.util.Map;

/**
 * @Author: weizz
 * @Date: 2019/9/18 16:04
 * @Description: 136. 只出现一次的数字
 * 通过观察，和结合按位异或操作符的性质我们可以发现一个按位异或操作的性质：一个值和0进行按位异或操作所得为该值，相同的两个值进行异或操作，所得为0（甲 按位异或 0 得 甲，甲 按位异或 甲 得 0）。
 * 根据这个性质，由于每个重复元素重复两次，故他们在遍历后将相互抵消，而唯一元素只出现一次，故将得到保留
 * @Version:1.0
 */
public class SingleNumber {

    public static void singleNumber(int[] nums) {
        HashSet<Integer> set  = new HashSet<>();
        for (int num : nums) {
            boolean add = set.add(num);
            if(!add){
                set.remove(num);
            }
        }
        set.forEach(lang -> System.out.println(lang));
    }
    public static int singleNumber2(int[] nums) {
        int temp = 0;
        for (int num : nums) {
            temp ^= num;
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber2(nums));
    }
}
