package com.wei.learncode.zxbx;

import com.wei.learncode.geektime.three.BlockedQueue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ProducerConsumerExample {

    private static Queue<Integer> queue = new LinkedList<>();
    private  static final Integer size = 1;

    private static Object lock = new Object();
    public static void main(String[] args) {

        Thread producerThread = new Thread(() -> {
            producer();
        });
        Thread consumerThread = new Thread(() -> {
            consumer();
        });

    }

    private static void producer() {
        int item = 1;
        while (true){
            synchronized (lock){
                while(queue.size() >= size){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                queue.offer(item);
                System.out.println("生产者生产数据:"+item);
                lock.notifyAll();;
            }
        }
    }
    private static void consumer() {

    }
}
