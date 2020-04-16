package com.wei.learncode.jvm;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: skye
 * @Date: 2020/4/14 14:42
 * @Description:
 * @Version:1.0
 */
public class Test5 {

    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(20, 20, 1000,
                TimeUnit.SECONDS, new LinkedBlockingQueue<>(5));
        for (int i = 0; i < 25; i++) {
            executor.submit(() -> {
                System.out.println(Runtime.getRuntime().availableProcessors());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
