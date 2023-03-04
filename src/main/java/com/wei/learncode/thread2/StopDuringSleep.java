package com.wei.learncode.thread2;

public class StopDuringSleep {

    //休眠中线程可以感知到中断,抛出InterruptedException
    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = () -> {

            int num = 0;

            try {
                while (!Thread.currentThread().isInterrupted() && num <= 1000) {

                    System.out.println(num++);
                    Thread.sleep(1000000);
                }

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();

            }

        };

        Thread thread = new Thread(runnable);

        thread.start();

        Thread.sleep(2000);

        thread.interrupt();

    }

}
