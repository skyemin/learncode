package com.wei.learncode.design.watcher2;

/**
 * @Author: skye
 * @Date: 2020/3/17 16:15
 * @Description:
 * @Version:1.0
 */
public class User implements Observer{

    private String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name+"收到了消息:"+message);
    }
}
