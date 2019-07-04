package com.wei.learncode.thread.demo;

import java.util.concurrent.TimeUnit;

/**
 * @Author: weizz
 * @Date: 2019/6/26 18:10
 * @Description:
 * @Version:1.0
 */
public class SleepUtils {
    public static final void second(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
}
