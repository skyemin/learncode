package com.wei.learncode.thread.pool;

import java.util.HashMap;
import java.util.UUID;

/**
 * @Author: weizz
 * @Date: 2019/6/27 16:41
 * @Description:
 * @Version:1.0
 */
public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        final HashMap<String, String> map = new HashMap<String, String>(2);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            map.put(UUID.randomUUID().toString(), "");
                        }
                    }, "ftf" + i).start();
                }
            }
        }, "ftf");
        t.start();
        t.join();
        System.out.println(1);
    }
}
