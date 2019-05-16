package com.wei.learncode.thread.wait;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * @Author: weizz
 * @Date: 2019/5/12 11:19
 * @Description:
 * @Version:1.0
 */
public class Test {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(10);
        for (int i=1;i<=10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"进来了");
                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            },"线程"+i).start();
        }
        System.out.println(1);
    }
}
