package com.wei.learncode.geektime.three;

import java.util.concurrent.Semaphore;

/**
 * @Author: skye
 * @Date: 2019/11/4 13:54
 * @Description:
 * @Version:1.0
 */
public class TestSam {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(10);

        try {
            semaphore.acquire();
            System.out.println(1123);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }
}
