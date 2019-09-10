/*
 * Copyright 2018 Shanxi Lu'an Taihang Laihui Net Tech co.,LTD.
 */
package com.wei.learncode.spring.ioc_base.abstracts;

/**
 * Description:
 *
 * @author wzz
 * @since: 1.0
 * Create Date Time: 2018/12/15 17:27
 * Update Date Time:
 */
//产品等级1的实现类
public class Creator1 extends AbstractCreator {
    //只生产产品等级为1的A产品
    public AbstractProductA createProductA() {
        return new ProductA1();
    }
    //只生产产品等级为1的B产品
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
