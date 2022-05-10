package com.wei.learncode.threadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InheritableThreadLocalContext {

    private static InheritableThreadLocal<Context> context = new InheritableThreadLocal<>();

    static class Context {

        String name;

        int value;
    }

    public static void main(String[] args) {
        // 固定线程池
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            new Thread(
                    () -> {
                        // 生成任务的线程对context进行赋值
                        Context contextMain = new Context();
                        contextMain.name = String.format("Thread%s name", finalI);
                        contextMain.value = finalI * 20;
                        InheritableThreadLocalContext.context.set(contextMain);
                        // 提交任务
                        for (int j = 1; j <= 10; j++) {
                            System.out.println("Thread" + finalI + " produce task " + (finalI * 20 + j));
                            executorService.execute(() -> {
                                // 执行任务的子线程
                                Context contextChild = InheritableThreadLocalContext.context.get();
                                System.out.println(Thread.currentThread().getName() + " execute task, name : " + contextChild.name + " value : " + contextChild.value);
                            });
                        }

                    }
            ).start();
        }
    }
}
