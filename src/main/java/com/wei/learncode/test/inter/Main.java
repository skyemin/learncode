package com.wei.learncode.test.inter;

/**
 * @Author: weizz
 * @Date: 2019/7/4 9:55
 * @Description:
 * @Version:1.0
 */
public class Main {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ApplicationImpl();

        beanFactory.getBean("zs");
    }

}
