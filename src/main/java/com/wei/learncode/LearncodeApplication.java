package com.wei.learncode;

import com.wei.learncode.test.User;
import com.wei.learncode.test.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
public class LearncodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearncodeApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
		User user = context.getBean(User.class);
		User user1 = context.getBean(User.class);
		System.out.println(user == user1);
		//String[] names = context.getBeanNamesForType(User.class);
		/*// 查看基于注解的 IOC容器中所有组件名称
		String[] beanNames = context.getBeanDefinitionNames();
		Arrays.asList(beanNames).forEach(System.out::println);*/
	}

}
