package com.wei.learncode.geektime.three;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author: skye
 * @Date: 2019/11/2 14:12
 * @Description:
 * @Version:1.0
 */
public class Test {
    public static final Logger logger = LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) throws InterruptedException {


        Thread t = new Thread(()->{
            try {
                LockSupport.park();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            logger.debug("线程:{},哈哈:{}",123,456);
        });
        t.start();
        //
        // System.out.println(456);
        LockSupport.unpark(t);
    }
}
