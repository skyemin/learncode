package com.wei.learncode.jvm;

/**
 * @Author: skye
 * @Date: 2020/6/12 10:09
 * @Description:
 * @Version:1.0
 */
public class Test13 {

    public volatile int i = 0;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static void main(String[] args) {

        Test13 test13 = new Test13();
        new Thread(()->{
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            test13.setI(10);
        }).start();
        new Thread(()->{
            System.out.println(test13.getI());
        }).start();


    }
}
