package com.wei.learncode.geekAlgorithm.day5.time1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author skye
 * @version 1.0
 * @description:  https://leetcode-cn.com/problems/valid-anagram/
 * @date 2021/2/22 15:33
 */
public class IsAnagram {

    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> map = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            Integer value = map.get(t.charAt(i));
            if(value == null){
                return false;
            }else if(value > 1){
                map.put(t.charAt(i),value-1);
            }else{
                map.remove(t.charAt(i));
            }
        }
        return map.isEmpty();
    }
}
