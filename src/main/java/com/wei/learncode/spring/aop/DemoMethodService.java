package com.wei.learncode.spring.aop;


import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {
	public void add(){
		System.out.println("切入方法");
	}
	public void around(){
		//System.out.println("我来测试的");
	}
}
