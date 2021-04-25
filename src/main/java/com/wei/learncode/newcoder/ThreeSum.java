package com.wei.learncode.newcoder;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/25 16:52
 */
public class ThreeSum {

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {


        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(num);
        int length = num.length;
        for (int i = 0; i < length; i++) {
            if(num[i] > 0){
                return res;
            }
            if(i>0 && num[i] == num[i-1]){
                continue;
            }
            int left = i+1;
            int right = length-1;
            while (left < right){
                int tmp = num[i]+num[left]+num[right];
                if(tmp == 0){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(num[i]);
                    list.add(num[left]);
                    list.add(num[right]);
                    res.add(list);
                    while (left < right && num[left+1] == num[left]){
                        left++;
                    }
                    while (left < right && num[right-1] == num[right]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(tmp < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return res;
    }
}
