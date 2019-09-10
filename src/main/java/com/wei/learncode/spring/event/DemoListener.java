package com.wei.learncode.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//定义事件监听器,实现ApplicationListener
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	@Override
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		System.out.println("我收到了消息:"+msg);
	}
}
