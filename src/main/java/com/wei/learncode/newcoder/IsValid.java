package com.wei.learncode.newcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/15 10:05
 */
public class IsValid {

    public static Map<Character,Character> map = new HashMap<>(4);
    static {
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
    }

    public boolean isValid (String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
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
        // write code here
        return stack.isEmpty();
    }
}
