package com.wei.learncode.design.adapt.begin;

import java.util.Stack;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2020/10/23 17:59
 */
public class StackImplQueue {

    Stack stack1 = new Stack();
    Stack stack2 = new Stack();
    public void add(String value){

        stack1.push(value);
    }

    public String get(){
        if(stack2.size() == 0){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return (String) stack2.pop();
    }

    public static void main(String[] args) {
        StackImplQueue stackImplQueue = new StackImplQueue();
        stackImplQueue.add("1");
        stackImplQueue.add("2");
        stackImplQueue.add("3");
        System.out.println(stackImplQueue.get());
        System.out.println(stackImplQueue.get());
        System.out.println(stackImplQueue.get());
    }
}
