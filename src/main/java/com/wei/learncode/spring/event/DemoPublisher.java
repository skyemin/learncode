package com.wei.learncode.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {

	@Autowired
	public ApplicationContext applicationContext;
	public void publish(String msg){
		//发布事件
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}
}
