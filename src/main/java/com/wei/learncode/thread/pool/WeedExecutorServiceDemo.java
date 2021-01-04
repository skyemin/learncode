package com.wei.learncode.thread.pool;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2020/12/22 16:00
 */
public class WeedExecutorServiceDemo {
    /**
     * 继续用之前建好的线程池，只是调整一下池大小
     */
    BlockingQueue<Runnable> taskQueue;
    final static WeedThreadPool weedThreadPool = new WeedThreadPool(1, 5, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(100));
    public static Random r = new Random();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletionService<Integer> cs = new ExecutorCompletionService<Integer>(weedThreadPool);
        for (int i = 0; i < 3; i++) {
            int finalI = i;
            cs.submit(() -> {
                //获取计算任务
                int init = 0;
                for (int j = 0; j < 100; j++) {
                    init += r.nextInt();
                }
                if(finalI == 2 ){
                    Thread.sleep(300000L);
                }else{
                    Thread.sleep(1000L);

                }
                return Integer.valueOf(init);
            });
        }
        weedThreadPool.shutdown();
        /**
         * 通过take方法获取，阻塞，直到有任务完成
         */
        for (int i = 0; i < 3; i++) {
            System.out.println(cs.take().get());
        }
    }
}

