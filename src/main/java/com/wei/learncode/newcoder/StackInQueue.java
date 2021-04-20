package com.wei.learncode.newcoder;

import java.util.Stack;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/20 14:19
 */
public class StackInQueue {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
       stack1.push(node);
    }

    public int pop() {

        if(stack2.size() == 0){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
