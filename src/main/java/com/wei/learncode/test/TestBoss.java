package com.wei.learncode.test;

/**
 * @Author: skye
 * @Date: 2020/8/3 14:27
 * @Description:
 * @Version:1.0
 */
public class TestBoss {


    //grep '2019-01-01 1[0-1]' | grep 'cost [500-1000]ms' catalina.out |  awk {print'$4'} | sort -nr | uniq -c | sort -k1 -nr
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();
    public static void main(String[] args) {
        new Thread(()->{
            synchronized (lock1){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("thread1 start...");
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
                    System.out.println("thread2 start...");
                }
            }
        }).start();
    }
}
