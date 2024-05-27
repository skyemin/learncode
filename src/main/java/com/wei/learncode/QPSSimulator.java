package com.wei.learncode;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class QPSSimulator {

    // 假设这是你想要重复执行的方法
    public static void test() {
        // 这里写你的测试逻辑
        System.out.println("Test method executed at: " + System.currentTimeMillis());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        // 定义每秒执行的任务次数
        final int ratePerSecond = 2;
        // 定义测试持续时间（秒）
        final int durationMinutes = 5;

        // 创建一个ScheduledExecutorService实例
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(ratePerSecond);

        // 计划任务以达到每秒30次的执行频率
        for (int i = 0; i < ratePerSecond * durationMinutes; i++) {
            executor.schedule(QPSSimulator::test,
                    i * 1000L / ratePerSecond,  // 根据ratePerSecond计算延时，确保整体QPS
                    TimeUnit.MILLISECONDS);
        }

        // 在指定时间后关闭executor
        executor.schedule(() -> {
            executor.shutdown();
            System.out.println("Finished all threads");
        }, durationMinutes, TimeUnit.SECONDS);
    }
}

