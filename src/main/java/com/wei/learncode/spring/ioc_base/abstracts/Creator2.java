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
//产品等级2的实现类
public class Creator2 extends AbstractCreator {
    //只生产产品等级为2的A产品
    public AbstractProductA createProductA() {
        return new ProductA2();
    }
    //只生产产品等级为2的B产品
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
