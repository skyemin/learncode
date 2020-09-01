package com.wei.learncode;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @Author: skye
 * @Date: 2020/8/27 20:01
 * @Description:
 * @Version:1.0
 */
public class Test {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // 任务 1：调用推荐接口获取数据
        CompletableFuture<String> t1 =
                CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("T1: 获取推荐接口数据...");
                    return "[T1 板块数据]";
                });
        // 任务 2：调用搜索接口获取数据
        CompletableFuture<String> t2 =
                CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("T2: 调用搜索接口获取数据...");
                    return " [T2 板块数据] ";
                });

        CompletableFuture<String> t3 = t1.applyToEither(t2,result->{
            return result;

        });
        System.out.println(t3.get());
    }
}


