package com.wei.learncode.design.watcher2;

/**
 * @Author: skye
 * @Date: 2020/3/17 16:04
 * @Description:  被观察者接口
 * @Version:1.0
 */
public interface Observed {

    //添加观察者
    public void addObserver(Observer o);
    //移除观察者
    public void removeObserver(Observer o);
    //通知观察者
    public void notifyObserver();
}
