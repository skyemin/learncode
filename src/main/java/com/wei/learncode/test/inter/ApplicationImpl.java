package com.wei.learncode.test.inter;

/**
 * @Author: weizz
 * @Date: 2019/7/4 9:49
 * @Description:
 * @Version:1.0
 */
public class ApplicationImpl implements ApplicationContext{
    @Override
    public String getApplicationName() {
        return null;
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return new String[0];
    }

    @Override
    public Object getBean(String name) {
        return null;
    }
}
