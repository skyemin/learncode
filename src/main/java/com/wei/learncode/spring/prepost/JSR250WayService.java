package com.wei.learncode.spring.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

	@PostConstruct
	public void init(){
		System.out.println("初始化");
	}
	@PreDestroy
	public void destory(){
		System.out.println("销毁");
	}
	public JSR250WayService(){
		super();
		System.out.println("构造函数");
	}
	
}
