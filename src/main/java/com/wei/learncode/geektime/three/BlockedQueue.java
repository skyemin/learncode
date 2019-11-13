package com.wei.learncode.geektime.three;/*

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: skye
 * @Date: 2019/11/2 12:11
 * @Description:
 * @Version:1.0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BlockedQueue<T>{

    List<T> list = new ArrayList<>();
    final Lock lock =
            new ReentrantLock();
    // 条件变量：队列不满
    final Condition notFull =
            lock.newCondition();
    // 条件变量：队列不空
    final Condition notEmpty =
            lock.newCondition();

    // 入队
    void enq(T x) throws InterruptedException {
        lock.lock();
        try {
            while (list.size()>5){
                // 等待队列不满
                notFull.await();
            }
            // 省略入队操作...
            // 入队后, 通知可出队
            notEmpty.signal();
        }finally {
            lock.unlock();
        }
    }
    // 出队
    void deq(){
        lock.lock();
        try {
            while (list.size()==0){
                // 等待队列不空
                notEmpty.await();
            }
            // 省略出队操作...
            // 出队后，通知可入队
            notFull.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
