package com.wei.learncode.inteview;

public class PrintEvenAndOdd {

    private static int count = 0;
    private static final Object lock = new Object();

    static class PrintMun implements Runnable{
        @Override
        public void run() {
            while (count <= 100){
                synchronized (lock){
                    System.out.println("current Thread:"+Thread.currentThread().getName()+" print:"+count++);
                    lock.notify();
                    if(count <= 100){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new PrintMun(),"even thread").start();
        new Thread(new PrintMun(),"odd thread").start();

    }
}
