package com.wei.learncode.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author: skye
 * @Date: 2019/5/11 18:44
 * @Description:
 * @Version:1.0
 */
public class Main {

    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("beans.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);
    }
}
