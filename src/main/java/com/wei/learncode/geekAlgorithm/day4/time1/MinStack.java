package com.wei.learncode.geekAlgorithm.day4.time1;

import java.util.Stack;

/**
 * @author skye
 * @version 1.0
 * @description:  https://leetcode-cn.com/problems/min-stack/
 * @date 2021/2/2 11:22
 */
public class MinStack {
    public Stack<int[]> stack;
    public MinStack() {
        stack = new Stack();
    }

    public void push(int x) {
        if(stack.isEmpty()){
            stack.push(new int[]{x,x});
        }else{
            stack.push(new int[]{x,Math.min(x,stack.peek()[1])});
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
       return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }
}
