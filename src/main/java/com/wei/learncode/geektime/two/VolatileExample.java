package com.wei.learncode.geektime.two;

import java.awt.image.VolatileImage;

/**
 * @Author: skye
 * @Date: 2019/11/1 14:34
 * @Description: Happens-Before 规则
 * @Version:1.0
 */
public class VolatileExample {
    int x = 0;
    volatile boolean v = false;
    public void writer() {
       /* try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //1. 程序的顺序性规则:指在一个线程中，按照程序顺序，前面的操作 Happens-Before 于后续的任意操作。
        //2. volatile 变量规则:对一个 volatile 变量的写操作相对于后续对这个 volatile 变量的读操作可见
        //3. 传递性规则:如果 A Happens-Before B，且 B Happens-Before C，那么 A Happens-Before C。
        //4. 管程中锁的规则:对一个锁的解锁 Happens-Before 于后续对这个锁的加锁。
        //5. 线程 start() 规则:主线程 A 启动子线程 B 后，子线程 B 能够看到主线程在启动子线程 B 前的操作。
        //6.线程 join() 规则:主线程 A 等待子线程 B 完成（主线程 A 通过调用子线程 B 的 join() 方法实现），当子线程 B 完成后（主线程 A 中 join() 方法返回），主线程能够看到子线程的操作。当然所谓的“看到”，指的是对共享变量的操作。
        x = 42;
        v = true;
    }
    public void reader() {
        if (v == true) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        VolatileExample v = new VolatileExample();
        Thread thread1 = new Thread(()->{
           v.writer();
        });
        Thread thread2 = new Thread(()->{
            v.reader();
        });
        thread1.start();
        thread2.start();
    }
}
