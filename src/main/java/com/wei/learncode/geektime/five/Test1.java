package com.wei.learncode.geektime.five;

import java.util.concurrent.*;

/**
 * @Author: skye
 * @Date: 2019/11/7 11:37
 * @Description:
 * @Version:1.0
 */
public class Test1 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ExecutorCompletionService<Integer> service = new ExecutorCompletionService<>(executorService);

        service.submit(() -> Test.getA());
        service.submit(() -> Test.getB());
        service.submit(() -> Test.getC());

        for(int i=0;i<3;i++){
            Integer num = service.take().get();
            executorService.submit(()->{
                Test.save(num);
            });
        }
    }
}
