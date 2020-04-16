package com.wei.learncode.lambda;

/**
 * @Author: skye
 * @Date: 2020/4/9 14:10
 * @Description:
 * @Version:1.0
 */
public class VolatileDemo {
    private static  boolean isOver = false;

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!isOver) {
                    int i = 1;
                };
            }
        });
        thread.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isOver = true;
    }
}
