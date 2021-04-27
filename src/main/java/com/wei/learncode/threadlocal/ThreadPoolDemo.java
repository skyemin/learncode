package com.wei.learncode.threadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author skye
 * @version 1.0
 * @description:  InheritableThreadLocal在线程池中的问题
 * @date 2020/10/27 15:14
 */
public class ThreadPoolDemo {

    public static final InheritableThreadLocal t = new InheritableThreadLocal();

    public static void main(String[] args) {
        t.set("test");
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Runnable runnable1 = () -> {
            System.out.println("new修改前:" + t.get());
        };
        Runnable runnable2 = ()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("new修改后:"+t.get());
        };
        executorService.submit(runnable1);
        System.out.println("main修改前:"+t.get());
        t.set("test1");
        System.out.println("main修改后:"+t.get());
        executorService.submit(runnable2);
        System.out.println("main最后:"+t.get());
    }
}
