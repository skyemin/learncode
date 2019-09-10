/*
 * Copyright 2018 Shanxi Lu'an Taihang Laihui Net Tech co.,LTD.
 */
package com.wei.learncode.spring.ioc_base.abstracts;

/**
 * Description:
 *
 * @author wzz
 * @since: 1.0
 * Create Date Time: 2018/12/15 17:17
 * Update Date Time:
 */
//抽象产品类
public abstract class AbstractProductB {
    //每个产品共有的方法
    public void shareMethod(){
    }
    //每个产品相同方法，不同实现
    public abstract void doSomething();
}
