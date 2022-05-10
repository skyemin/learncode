package com.wei.learncode.design.adapt.begin;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2020/11/3 11:22
 */
public class QueueImplStack {

    Queue queue1 = new LinkedBlockingQueue();
    //Queue queue2 = new LinkedBlockingQueue();

    /** Push element x onto stack. */
    public void push(int x) {

        int count = queue1.size();
        queue1.add(x);
        for (int i = 0; i < count; i++) {
            queue1.add(queue1.poll());
        }
        /*//用两个队列实现栈
        queue1.add(x);
        while (!queue2.isEmpty()){
            queue1.add(queue2.poll());
        }
        Queue tmp = queue1;
        queue1 = queue2;
        queue2 =tmp;*/

    }


    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return (int) queue1.poll();
    }

    /** Get the top element. */
    public int top() {
        return (int) queue1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.size() == 0;
    }

    public static void main(String[] args) {
        QueueImplStack queueImplStack = new QueueImplStack();
        queueImplStack.push(2);
        queueImplStack.push(1);
        System.out.println(queueImplStack.top());
    }


}
