package com.wei.learncode.design.watcher2;

/**
 * @Author: skye
 * @Date: 2020/3/17 16:16
 * @Description:
 * @Version:1.0
 */
public class Main {

    public static void main(String[] args) {
        User user = new User("张三");
        User user2 = new User("李四");

        Wechat wechat = new Wechat();
        wechat.addObserver(user);
        wechat.addObserver(user2);
        wechat.sendMessage("你好");
        wechat.notifyObserver();
    }



}
