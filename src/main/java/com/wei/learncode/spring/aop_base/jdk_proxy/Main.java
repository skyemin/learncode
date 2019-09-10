package com.wei.learncode.spring.aop_base.jdk_proxy;

public class Main {

	//jdk动态代理,Spring默认实现方式
	public static void main(String[] args) {
		
		BookFacadeProxy b = new BookFacadeProxy();
		BookFacade bookFacade = (BookFacade) b.bind(new BookFacadeImpl());
		bookFacade.addBook();
	}
}
