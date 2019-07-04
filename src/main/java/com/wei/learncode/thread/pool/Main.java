package com.wei.learncode.thread.pool;

import java.sql.Time;
import java.util.concurrent.*;

/**
 * @Author: weizz
 * @Date: 2019/6/27 16:14
 * @Description:
 * @Version:1.0
 */
public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 100L, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2));
        Future<?> future = threadPoolExecutor.submit(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("任务进行");
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        );
        try {
            future.get(2,TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println("CPU核数:"+Runtime.getRuntime().availableProcessors());
        threadPoolExecutor.shutdown();
    }
}
