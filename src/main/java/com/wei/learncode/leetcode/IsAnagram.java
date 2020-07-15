package com.wei.learncode.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: skye
 * @Date: 2020/7/2 18:19
 * @Description:
 * @Version:1.0
 */
public class IsAnagram {

    public static boolean isAnagram(String s, String t) {

        Map<Character, Integer> map = new HashMap();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.get(c)!=null){
                int tmp =  map.get(c);
                map.put(c,++tmp);
            }else{
                map.put(c,0);
            }
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(map.get(c) != null){
                int tmp = map.get(c);
                if(tmp == 0){
                    map.remove(c);
                }else{
                    map.put(c,--tmp);
                }
            }else{
                map.put(c,0);
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s = "aa", t = "a";
        System.out.println(isAnagram(s, t));
    }

}
