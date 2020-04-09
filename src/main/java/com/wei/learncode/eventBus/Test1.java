package com.wei.learncode.eventBus;

import com.google.common.eventbus.Subscribe;

/**
 * @Author: skye
 * @Date: 2020/3/26 16:48
 * @Description:
 * @Version:1.0
 */
public class Test1{
    @Subscribe
    public void test(String msg) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Test1收到消息:"+msg);

    }
}
