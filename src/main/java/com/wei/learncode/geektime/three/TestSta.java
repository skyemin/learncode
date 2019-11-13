package com.wei.learncode.geektime.three;

import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.StampedLock;

/**
 * @Author: skye
 * @Date: 2019/11/4 17:36
 * @Description:
 * @Version:1.0
 */
public class TestSta {

    public static void main(String[] args) throws InterruptedException {

        final StampedLock lock
                = new StampedLock();
        Thread T1 = new Thread(()->{
            // 获取写锁
            lock.writeLock();
            // 永远阻塞在此处，不释放写锁
            LockSupport.park();
        });
        T1.start();
// 保证 T1 获取写锁
        Thread.sleep(100);
        Thread T2 = new Thread(()->
                // 阻塞在悲观读锁
                lock.readLock()
        );
        T2.start();
// 保证 T2 阻塞在读锁
        Thread.sleep(100);
// 中断线程 T2
// 会导致线程 T2 所在 CPU 飙升
        T2.interrupt();
        T2.join();
    }
}
