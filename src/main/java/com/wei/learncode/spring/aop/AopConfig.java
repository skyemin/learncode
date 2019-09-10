package com.wei.learncode.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.wei.aop")
//开启spring对aspectj的支持
@EnableAspectJAutoProxy
public class AopConfig {

}
