package com.wei.learncode.newcoder;

import java.util.HashMap;
import java.util.Map;

/**
 * @author skye
 * @version 1.0
 * @description: 最长重复子串
 * @date 2021/4/12 18:21
 */
public class MaxLength {

    public int maxLength (int[] arr) {

       /* int max = 1;
        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> set = new HashSet();
            for (int j = i; j < arr.length; j++) {
                if(set.contains(arr[j])){
                    break;
                }
                set.add(arr[j]);
            }
            max = Math.max(max,set.size());
        }
        return max;*/

        Map<Integer,Integer> map = new HashMap<>();
        int max = 1;
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                left = Math.max(map.get(arr[i])+1,left);
            }
            max = Math.max(max,i-left+1);
            map.put(arr[i],i);
        }
        return max;
    }
}
