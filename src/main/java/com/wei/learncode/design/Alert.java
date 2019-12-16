package com.wei.learncode.design;

/**
 * @Author: skye
 * @Date: 2019/12/13 15:00
 * @Description:
 * @Version:1.0
 */
public class Alert {

    private Rule rule;
    private Notify notify;

    public Alert(Rule rule,Notify notify){
        this.rule = rule;
        this.notify = notify;
    }
    public void check(long startTime,long endTime){
        if("1".equals(rule.getName())){
            notify.notify("111");
        }
        if("2".equals(rule.getName())){
            notify.notify("222");
        }
    }
}
//预警规则类
class Rule{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//预警通知类
class Notify{
    public void notify(String message){
        System.out.println(message);
    }
}