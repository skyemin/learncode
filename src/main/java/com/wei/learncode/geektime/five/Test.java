package com.wei.learncode.geektime.five;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.*;

/**
 * @Author: skye
 * @Date: 2019/11/7 10:43
 * @Description:
 * @Version:1.0
 */
public class Test {

    public static final Logger logger = LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Integer> f1 = executorService.submit(() -> getA());
        Future<Integer> f2 = executorService.submit(() -> getB());
        Future<Integer> f3 = executorService.submit(() -> getC());

        executorService.submit(()->{
            try {
                queue.put(f1.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        executorService.submit(()->{
            try {
                queue.put(f2.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        executorService.submit(()->{
            try {
                queue.put(f3.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        System.out.println(111111);
        for(int i=0;i<3;i++){
            System.out.println(33333);
            Integer take = queue.take();
            executorService.submit(()->save(take));
        }
    }
    public static Integer getA() throws InterruptedException {
        Thread.sleep(5000);
        return 1;
    }
    public static Integer getB() throws InterruptedException {
        Thread.sleep(1000);
        return 2;
    }
    public static Integer getC() throws InterruptedException {
        Thread.sleep(8000);
        return 3;
    }
    public static void save(Integer num){
        logger.debug("保存成功,num值为:{}",num);
    }
}
