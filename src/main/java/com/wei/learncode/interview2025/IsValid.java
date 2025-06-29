package com.wei.learncode.interview2025;

import java.util.Stack;

public class IsValid {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(c == '('){
                stack.push(')');
            } else if (c == '[') {
                stack.push('}');
            } else if (c == ']') {
                stack.push('}');
            }else{
                if(stack.isEmpty() || stack.pop() != c)
                    return false;
            }

        }

        return stack.isEmpty();
    }
}
