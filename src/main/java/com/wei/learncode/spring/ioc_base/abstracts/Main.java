/*
 * Copyright 2018 Shanxi Lu'an Taihang Laihui Net Tech co.,LTD.
 */
package com.wei.learncode.spring.ioc_base.abstracts;

/**
 * Description:
 *
 * @author wzz
 * @since: 1.0
 * Create Date Time: 2018/12/15 17:28
 * Update Date Time:
 */
public class Main {
    public static void main(String[] args) {
        //定义出两个工厂
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();
        //产生A1对象
        AbstractProductA a1 =  creator1.createProductA();
        //产生A2对象
        AbstractProductA a2 = creator2.createProductA();
        //产生B1对象
        AbstractProductB b1 = creator1.createProductB();
        //产生B2对象
        AbstractProductB b2 = creator2.createProductB();

        a1.doSomething();
        a2.doSomething();
        b1.doSomething();
        b2.doSomething();
    }
}
