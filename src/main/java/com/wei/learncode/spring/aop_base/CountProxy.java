package com.wei.learncode.spring.aop_base;

//代理类(静态代理,一个代理类只能为一个接口服务)
public class CountProxy implements Count{

	private CountImpl countImpl;
	
	
	public CountProxy(CountImpl countImpl) {
		this.countImpl = countImpl;
	}
	@Override
	public void queryCount() {
		
		countImpl.queryCount();
	}

	@Override
	public void updateCount() {
		
		System.out.println("事务处理之前");
		countImpl.updateCount();
		System.out.println("事务处理之后");
	}

}
