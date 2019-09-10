package com.wei.learncode.spring.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

	@Acction(name="注解式拦截的add操作")
	public void add(){
		System.out.println("注解式");
	}
}
