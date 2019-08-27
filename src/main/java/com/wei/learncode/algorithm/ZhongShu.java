package com.wei.learncode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: weizz
 * @Date: 2019/8/22 18:20
 * @Description:
 * @Version:1.0
 */
public class ZhongShu {
    public static void main(String[] args) {
       Set<Integer> set = new HashSet();
       int[] num = {3,2,3};
       int n = num.length/2;
        for (int i = 0; i < num.length; i++) {
            int count = 0;
            for (int j = 0; j < num.length; j++) {
                if(num[i] == num[j]){
                    count++;
                }
            }
            if(count>n){
                set.add(num[i]);
            }
        }
        for (Integer o : set) {
            System.out.println(o);
        }
    }
}
