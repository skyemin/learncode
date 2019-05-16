package com.wei.learncode.thread.basic;

/**
 * @Author: weizz
 * @Date: 2019/4/30 11:18
 * @Description:
 * @Version:1.0
 */
public class Test {

    private volatile int i = 0;
    public void write(int j) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i = j;
    }
    public int read() {
        return i;
    }

    public static void main(String[] args) {
        Test t = new Test();
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.write(10);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(t.read());
            }
        }).start();
    }
}
