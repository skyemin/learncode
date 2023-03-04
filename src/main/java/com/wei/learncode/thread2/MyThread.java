package com.wei.learncode.thread2;

public class MyThread extends Thread{

    public void run(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程开始执行,name:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println(myThread.getState());
        myThread.setName("线程名字");
        myThread.start();
        System.out.println(myThread.getState());
        System.out.println("main thread process success...");
    }
}
