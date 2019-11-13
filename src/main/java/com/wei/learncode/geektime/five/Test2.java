package com.wei.learncode.geektime.five;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author: skye
 * @Date: 2019/11/7 13:59
 * @Description:
 * @Version:1.0
 */
public class Test2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ExecutorCompletionService<Integer> cs = new ExecutorCompletionService<>(executorService);

        List<Future<Integer>> list = new ArrayList<>();
        list.add(cs.submit(()->Test.getA()));
        list.add(cs.submit(()->Test.getA()));
        list.add(cs.submit(()->Test.getA()));
        Integer num = 0;
        try {
            for(int i=0;i<3;i++){
                num = cs.take().get();
                if(num !=null){
                    break;
                }
            }
        }finally {
            for (Future<Integer> future : list) {
                future.cancel(true);
            }
        }
        System.out.println(num);
    }
}
