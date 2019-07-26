/*
 * Copyright 2018 Shanxi Lu'an Taihang Laihui Net Tech co.,LTD.
 */
package com.wei.learncode.algorithm;

/**
 * Description:数组实现栈(先进后出)
 *
 * @author wzz
 * @since: 1.0
 * Create Date Time: 2019/1/7 10:07
 * Update Date Time:
 */
public class ArrayStack {
    private long[] a ;
    private int size;
    private int top;

    public ArrayStack(int maxSize){
        this.size = maxSize;
        this.a = new long[size];
        this.top = -1;
    }

    //入栈
    public void push(long value){
        if(isFull()){
            System.out.println("栈满了");
            return;
        }
        a[++top]  = value;
    }
    //返回栈顶内容但不删除
    public long peek(){
        if(isNull()){
            System.out.println("栈中无数据");
            return 0;
        }
        return a[top];
    }
    //返回栈顶内容并且删除
    public long pop(){
        if(isNull()){
            System.out.println("栈中无数据");
            return 0;
        }
        return a[top--];
    }
    private boolean isNull() {
        return top == -1;
    }

    private boolean isFull() {
        return top == size-1;
    }
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.println(a[i]+"  ");
        }
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(1);
        System.out.println(stack.peek());
        System.out.println(stack.peek());
    }
}
