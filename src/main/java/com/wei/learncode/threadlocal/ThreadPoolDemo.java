package com.wei.learncode.threadlocal;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.alibaba.ttl.threadpool.TtlExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author skye
 * @version 1.0
 * @description:  InheritableThreadLocal在线程池中的问题
 * @date 2020/10/27 15:14
 */
public class ThreadPoolDemo {

    //public static final InheritableThreadLocal t = new InheritableThreadLocal();
    public static final TransmittableThreadLocal<String> t = new TransmittableThreadLocal<>();


    public static void main(String[] args) throws InterruptedException {
        t.set("test");
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        //需要做修饰
        executorService = TtlExecutors.getTtlExecutorService(executorService);
        Runnable runnable1 = () -> {
            System.out.println("线程1:" + t.get());
        };
        Runnable runnable2 = () -> {
            System.out.println("线程2:" + t.get());
        };
        executorService.submit(runnable1);
        Thread.sleep(1000);
        t.set("test2");
        executorService.submit(runnable2);
        executorService.shutdown();
    }
}
