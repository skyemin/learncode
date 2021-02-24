package com.wei.learncode.geekAlgorithm.day4.time1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author skye
 * @version 1.0
 * @description:  https://leetcode-cn.com/problems/valid-parentheses/
 * @date 2021/2/2 10:41
 */
public class IsValid {

    public static Map map = new HashMap();
    Stack<Character> stack = new Stack();
    static {
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
    }
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        for (Character aChar : chars) {
           if(map.containsKey(aChar)){
               stack.push(aChar);
           }else{
               Character top = stack.isEmpty()?'#':stack.pop();
               if(aChar != map.get(top)){
                   return false;
               }
           }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        IsValid isValid = new IsValid();
        String s = "([{}])";
        System.out.println(isValid.isValid(s));
    }
}
