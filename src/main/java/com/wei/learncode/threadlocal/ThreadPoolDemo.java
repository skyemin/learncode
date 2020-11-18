package com.wei.learncode.threadlocal;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2020/10/27 15:14
 */
public class ThreadPoolDemo {

    private static final ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 5, 1, TimeUnit.MINUTES, new LinkedBlockingQueue<>());
    public static final ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; ++i) {
            int finalI = i;
            poolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    threadLocal.set(finalI);
                    System.out.println(threadLocal.get());
                    // 其他业务代码
                    System.out.println("线程名称:"+ java.lang.Thread.currentThread().getName());
                }
            });
        }
    }
    static class BigObject {
        // 100M
        private byte[] bytes = new byte[100 * 1024 * 1024];
    }
}
