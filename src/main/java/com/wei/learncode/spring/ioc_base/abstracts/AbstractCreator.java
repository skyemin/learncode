/*
 * Copyright 2018 Shanxi Lu'an Taihang Laihui Net Tech co.,LTD.
 */
package com.wei.learncode.spring.ioc_base.abstracts;

/**
 * Description:抽象工厂类
 *
 * @author wzz
 * @since: 1.0
 * Create Date Time: 2018/12/15 17:21
 * Update Date Time:
 */
public abstract class AbstractCreator {
    //创建A产品家族
    public abstract AbstractProductA createProductA();
    //创建B产品家族
    public abstract AbstractProductB createProductB();
}
