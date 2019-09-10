package com.wei.learncode.spring.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");
		//后置注册Bean配置类,不然会报Bean未定义错误
		context.register(ProfileConfig.class);
		//刷新容器
		context.refresh();
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println(demoBean.getContent());
		context.close();
	}
}
