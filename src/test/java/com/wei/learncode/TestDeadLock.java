package com.wei.learncode;

/**
 * @Author: skye
 * @Date: 2020/8/11 20:09
 * @Description:
 * @Version:1.0
 */
public class TestDeadLock {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {

        new Thread(()->{
            synchronized (lock1){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("thread t1 end...");
                }
            }
        }).start();
        new Thread(()->{
            synchronized (lock2){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("thread t2 end...");
                }
            }
        }).start();
    }
}
