package com.wei.learncode.thread2;



public class MyRunnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程开始执行");
    }
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        new Thread(runnable).start();
        System.out.println("main thread process success...");
    }

}
