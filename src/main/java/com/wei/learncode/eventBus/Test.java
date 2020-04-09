package com.wei.learncode.eventBus;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

/**
 * @Author: skye
 * @Date: 2020/3/26 16:30
 * @Description:
 * @Version:1.0
 */
public class Test {

    private EventBus eventBus;
    public Test(){
        //同步阻塞
        //this.eventBus = new EventBus();
        //异步非阻塞
        this.eventBus = new AsyncEventBus(Executors.newSingleThreadExecutor());
    }

    //添加观察者
    public void setObserver(List<Object> observerList){
        observerList.forEach(lang -> eventBus.register(lang));
    }

    public void sendMessage(){
        System.out.println("开始发送消息....");
        eventBus.post("你好哈");
        System.out.println("发送完成");
    }

    public static void main(String[] args) {
        Test test = new Test();
        List<Object> observerList = new ArrayList<>();
        observerList.add(new Test1());
        test.setObserver(observerList);
        test.sendMessage();

    }
}
