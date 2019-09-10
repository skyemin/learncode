package com.wei.learncode.spring.aop_base.cglib;

public class Main {

	public static void main(String[] args) {
	
		BookFacadeProxy b = new BookFacadeProxy();
		BookFacadeImpl bookFacadeImpl = (BookFacadeImpl) b.getInstance(new BookFacadeImpl());
		bookFacadeImpl.addBook();
	}
}
