package com.wei.learncode.thread.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.LockSupport;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2020/11/6 15:25
 */
public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(Thread.currentThread().getName()+"开始执行");
                LockSupport.parkNanos(5000*1000*1000);
                Thread.sleep(3000);
                return "123";
            }
        };

        FutureTask<String> task = new FutureTask<>(callable);
        task.run();
        //Executors.newFixedThreadPool(10).submit(task);
        String s = task.get();
        System.out.println(s);
    }
}
