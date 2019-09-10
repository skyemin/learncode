package com.wei.learncode.spring.prepost;

public class BeanWayService {

	public void init(){
		System.out.println("初始化");
	}
	public void destory(){
		System.out.println("销毁");
	}
	public BeanWayService(){
		super();
		System.out.println("构造函数");
	}
}
