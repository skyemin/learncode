package com.wei.learncode.design.watcher2;

/**
 * @Author: skye
 * @Date: 2020/3/17 16:07
 * @Description: 观察者接口
 * @Version:1.0
 */
public interface Observer {

    //被观察者通知的时候调用
    public void update(String message);
}
