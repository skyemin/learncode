package com.wei.learncode.geektime.three;

/**
 * @Author: skye
 * @Date: 2019/11/1 16:07
 * @Description:
 * @Version:1.0
 */
public class SafeCalc {
    long value = 0L;
    synchronized long get() {
        return value;
    }
    synchronized void addOne() {
        value += 1;
    }

    public static void main(String[] args) {
        SafeCalc s = new SafeCalc();
        new Thread(()->{
            System.out.println(s.get());
        }).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->{
           s.addOne();
        }).start();
    }
}
