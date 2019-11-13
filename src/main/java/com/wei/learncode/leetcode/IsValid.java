package com.wei.learncode.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author: skye
 * @Date: 2019/11/13 10:26
 * @Description:
 * @Version:1.0
 */
public class IsValid {

    static Map<Character,Character> map = new HashMap<>();
    static {
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                char top = stack.isEmpty()?'#':stack.pop();
                if(top != map.get(c)){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}
