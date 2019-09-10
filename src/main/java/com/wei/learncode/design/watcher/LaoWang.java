package com.wei.learncode.design.watcher;

/**
 * @Author: weizz
 * @Date: 2019/3/19 13:44
 * @Description:
 * @Version:1.0
 */
public class LaoWang implements Person{
    @Override
    public void getMessage(String s) {
        System.out.println("老王收到了消息: "+s);
    }
}
