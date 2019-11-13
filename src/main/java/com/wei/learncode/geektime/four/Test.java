package com.wei.learncode.geektime.four;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @Author: skye
 * @Date: 2019/11/6 14:08
 * @Description:
 * @Version:1.0
 */
public class Test {

    public static void main(String[] args) {
        CompletableFuture<Void> f1 = CompletableFuture.runAsync(()->{
            System.out.println(123);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        try {
            System.out.println(666);
            f1.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
