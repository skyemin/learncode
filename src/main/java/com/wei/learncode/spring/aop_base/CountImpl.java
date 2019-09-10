package com.wei.learncode.spring.aop_base;

//委托类
public class CountImpl implements Count{

	@Override
	public void queryCount() {
		System.out.println("查询账户啦...");
	}

	@Override
	public void updateCount() {
		System.out.println("修改账户啦...");
	}

}
