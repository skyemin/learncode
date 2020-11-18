package com.wei.learncode.thread.daemon;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2020/11/5 15:58
 */
public class Test {

    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println(main.getName()+" start");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    System.out.println("子线程:" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // 开一个子线程去执行
        thread.start();
        /*// 当前主线程等待子线程执行完成之后再执行
        try {

            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println(main.getName()+" end");
    }
}
