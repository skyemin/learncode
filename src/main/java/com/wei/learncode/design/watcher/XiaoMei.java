package com.wei.learncode.design.watcher;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: weizz
 * @Date: 2019/3/19 13:49
 * @Description:
 * @Version:1.0
 */
public class XiaoMei {
    List<Person> list = new ArrayList<>();
    public void addPerson(Person person){
        list.add(person);
    }
    public void sendMessage(){
        list.forEach(lang -> lang.getMessage("两只舔狗谁来找我呢?"));
    }
}
