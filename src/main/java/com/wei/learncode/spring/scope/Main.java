package com.wei.learncode.spring.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
		DemoPrototypeService s1 = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService s2 = context.getBean(DemoPrototypeService.class);
		System.out.println("prototype:"+(s1==s2));
		
		DemoSingletonService s3 = context.getBean(DemoSingletonService.class);
		DemoSingletonService s4 = context.getBean(DemoSingletonService.class);
		System.out.println("singleton:"+(s3==s4));
		
		context.close();
	}
}
