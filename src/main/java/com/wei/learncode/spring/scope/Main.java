package com.wei.learncode.spring.scope;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.ValueFilter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
//		DemoPrototypeService s1 = context.getBean(DemoPrototypeService.class);
//		DemoPrototypeService s2 = context.getBean(DemoPrototypeService.class);
//		System.out.println("prototype:"+(s1==s2));
//
//		DemoSingletonService s3 = context.getBean(DemoSingletonService.class);
//		DemoSingletonService s4 = context.getBean(DemoSingletonService.class);
//		System.out.println("singleton:"+(s3==s4));
		
		//context.close();

//		User user = new User();
//		User.Son son = new User.Son();
//		son.setName("123");
//		user.setSon(son);
//		ValueFilter filter = (objField, fieldName, value) -> {
//			if ("name".equals(fieldName)) {
//				return null;
//			}
//			return value; // 返回原始值
//		};
//		String jsonString = JSON.toJSONString(user,filter);
//		System.out.println(jsonString);


	}

}
