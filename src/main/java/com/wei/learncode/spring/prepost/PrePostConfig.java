package com.wei.learncode.spring.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wei.prepost")
public class PrePostConfig {

	@Bean(initMethod="init",destroyMethod="destory")
	public BeanWayService beanWayService(){
		return new BeanWayService();
	}
	@Bean
	public JSR250WayService jsr250WayService(){
		return new JSR250WayService();
	}
}
