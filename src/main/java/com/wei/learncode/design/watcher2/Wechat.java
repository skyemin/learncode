package com.wei.learncode.design.watcher2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: skye
 * @Date: 2020/3/17 16:08
 * @Description:
 * @Version:1.0
 */
public class Wechat implements Observed{

    public List<Observer> list = new ArrayList<>();
    public String message;

    @Override
    public void addObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObserver() {
        list.forEach(lang -> lang.update(message));
    }

    public void sendMessage(String message){
        this.message = message;
        notifyObserver();
    }

}
