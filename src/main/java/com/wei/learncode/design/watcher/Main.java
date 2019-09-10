package com.wei.learncode.design.watcher;

/**
 * @Author: weizz
 * @Date: 2019/3/19 13:57
 * @Description:
 * @Version:1.0
 */
public class Main {
    public static void main(String[] args) {
        LaoWang laoWang = new LaoWang();
        LaoLi laoLi = new LaoLi();
        XiaoMei xiaoMei = new XiaoMei();
        xiaoMei.addPerson(laoWang);
        xiaoMei.addPerson(laoLi);
        xiaoMei.sendMessage();
    }
}
