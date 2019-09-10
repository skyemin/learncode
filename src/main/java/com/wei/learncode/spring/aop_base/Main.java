package com.wei.learncode.spring.aop_base;

public class Main {

	//静态代理
	public static void main(String[] args) {
		 
		 CountImpl countImpl = new CountImpl();  
		 CountProxy countProxy = new CountProxy(countImpl);
		 countProxy.updateCount();  
	}
}
