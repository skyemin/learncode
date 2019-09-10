package com.wei.learncode.design.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: weizz
 * @Date: 2019/3/19 11:15
 * @Description: 懒汉式(线程安全)
 * @Version:1.0
 */
public class Singleton3 {

    private Singleton3(){

    }
    private static Singleton3 s;
    public static synchronized Singleton3 getInstance(){
        if(s == null){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s = new Singleton3();
        };
        return s;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton3.getInstance());
                }
            });
        }
        executorService.shutdown();
    }
}
