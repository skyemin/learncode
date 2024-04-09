package com.wei.learncode.spring.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

//声明当前类是一个配置类
@Configuration
//自动扫描包名下所有使用@Service,@Component,@Repository,@Controller的类,并注册Bean
@ComponentScan("com.wei.learncode.spring.di")
public class DiConfig {


    /*
    * 踩坑:当A2依赖A1时,A1构造方法读不到@value注入的值
    * 原因spring会先注入属性,再加载bean,当注入的方式引入a1时,注入a1走a1()方法,此时name和a1优先级有可能在name之前,导致拿不到
    * 解决方式将a1 a2配置类分开
    *
    * */
    @Value("123")
    private String name;

    @Resource
    private A1 a1;

    @Bean
    public A1 a1() {
        System.out.println("a1:"+name);
        return new A1();
    }

    @Bean
    public A2 a2(){
        System.out.println("a2:"+name);
        A2 a2 = new A2();
        a2.setA1(a1);
        return a2;
    }
}
