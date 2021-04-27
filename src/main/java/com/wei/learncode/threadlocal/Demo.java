package com.wei.learncode.threadlocal;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.alibaba.ttl.TtlRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author skye
 * @version 1.0
 * @description: https://juejin.cn/post/6955384463819800590#heading-12
 * @date 2021/4/27 16:37
 */
public class Demo {
    public static final ThreadLocal t = new TransmittableThreadLocal();

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
        executorService.submit(TtlRunnable.get(runnable1));
        System.out.println("main修改前:"+t.get());
        t.set("test1");
        System.out.println("main修改后:"+t.get());
        executorService.submit(TtlRunnable.get(runnable2));
        System.out.println("main最后:"+t.get());
    }
}
