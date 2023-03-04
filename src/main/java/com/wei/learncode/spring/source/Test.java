package com.wei.learncode.spring.source;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testSpringLoad() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
       /* TestA testA = (TestA) applicationContext.getBean("testA");
        testA.test();*/
    }
}
