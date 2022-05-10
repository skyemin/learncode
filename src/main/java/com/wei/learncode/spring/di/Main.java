package com.wei.learncode.spring.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		TestBean useFunctionService = context.getBean(TestBean.class);
		//System.out.println(useFunctionService.say("成功了"));
		context.close();
	}
}
