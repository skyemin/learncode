package com.wei.learncode.thread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2020/12/22 15:52
 */
public class WeedThreadTest {
    BlockingQueue<Runnable> taskQueue;
    final static WeedThreadPool weedThreadPool =new WeedThreadPool(3,10,1, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(100));
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<3;i++) {
            weedThreadPool.execute(WeedThreadTest::run);
        }
        Thread.sleep(2000L);
        weedThreadPool.shutdown();
    }

    private static void run() {
        System.out.println("thread id is: " + Thread.currentThread().getId());
        try {
            Thread.sleep(1024L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
