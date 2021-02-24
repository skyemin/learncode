package com.wei.learncode.geekAlgorithm.day5.time1;

import java.util.*;

/**
 * @author skye
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/group-anagrams/comments/
 * @date 2021/2/22 16:15
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}


