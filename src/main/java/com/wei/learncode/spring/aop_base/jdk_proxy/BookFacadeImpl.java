package com.wei.learncode.spring.aop_base.jdk_proxy;

public class BookFacadeImpl implements BookFacade{

	@Override
	public void addBook() {
		System.out.println("增加图书");
	}
}
