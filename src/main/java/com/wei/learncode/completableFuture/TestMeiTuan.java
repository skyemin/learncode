package com.wei.learncode.completableFuture;

import java.util.concurrent.*;

public class TestMeiTuan {

    public static void main(String[] args) {
    }

    public Object doGet() {
        ExecutorService threadPool1 = new ThreadPoolExecutor(10, 10, 0L, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(100));
        CompletableFuture cf1 = CompletableFuture.supplyAsync(() -> {
            //do sth
            return CompletableFuture.supplyAsync(() -> {
                System.out.println("child");
                return "child";
            }, threadPool1).join();//子任务
        }, threadPool1);
        return cf1.join();
    }
}
