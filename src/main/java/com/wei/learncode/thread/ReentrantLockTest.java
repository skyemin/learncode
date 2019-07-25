package com.wei.learncode.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: weizz
 * @Date: 2019/7/23 14:01
 * @Description:
 * @Version:1.0
 */
public class ReentrantLockTest {

    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();
        for (int i = 0; i < 3; i++) {
            lock.lock();
        }
        for (int i = 0; i <2; i++) {
            lock.unlock();
        }
        System.out.println("over...");
    }
}
