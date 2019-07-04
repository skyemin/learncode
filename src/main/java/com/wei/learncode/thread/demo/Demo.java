package com.wei.learncode.thread.demo;

/**
 * @Author: weizz
 * @Date: 2019/6/22 22:48
 * @Description:
 * @Version:1.0
 */
public class Demo implements Runnable{

    private static volatile int i;

    public static void main(String[] args) {
        Demo demo = new Demo();
        for (int j = 0; j < 100; j++) {
            new Thread(demo).start();
        }
    }

    @Override
    public void run() {
        System.out.println(i++);
    }
}
