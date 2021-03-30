package com.wei.learncode;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/3/29 19:43
 */
public class TestCopyOnWriteList {

    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(2);
        List list = new ArrayList();
        new Thread(()->{
            List list1 = new ArrayList();
            list1.add(1);
            list1.add(2);
            list1.add(3);
            list1.add(4);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.addAll(list1);
            countDownLatch.countDown();
        }).start();
        new Thread(()->{
            List list1 = new ArrayList();
            list1.add(4);
            list1.add(5);
            list1.add(6);
            list1.add(7);
            list.addAll(list1);
            countDownLatch.countDown();
        }).start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        list.forEach((lang)->{
            System.out.println(lang);
        });
    }
}
