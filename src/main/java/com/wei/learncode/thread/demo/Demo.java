package com.wei.learncode.thread.demo;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: weizz
 * @Date: 2019/6/22 22:48
 * @Description:
 * @Version:1.0
 */
public class Demo implements Runnable{

    private static  int i;

    public static void main(String[] args) {
        Demo demo = new Demo();
        for (int j = 0; j < 1000; j++) {
            new Thread(demo).start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }

    @Override
    public void run() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        i++;
        lock.unlock();
    }
}
