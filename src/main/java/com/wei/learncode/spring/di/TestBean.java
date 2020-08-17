package com.wei.learncode.spring.di;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: skye
 * @Date: 2020/8/10 14:42
 * @Description:
 * @Version:1.0
 */
@Component
public class TestBean implements InitializingBean, DisposableBean {



    @PostConstruct
    public void start(){
        System.out.println("PostConstruct... ");
    }
    @PreDestroy
    public void destroys(){
        System.out.println("PreDestroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy...");
    }


}
