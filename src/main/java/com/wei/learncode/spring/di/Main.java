package com.wei.learncode.spring.di;

import com.wei.learncode.spring.di.test1.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		Test test = (Test)context.getBean("test2");
		//System.out.println(useFunctionService.say("成功了"));
		test.test();
		context.close();
	}
}
