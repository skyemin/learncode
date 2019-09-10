package com.wei.learncode.spring.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
		for (int i = 1; i <= 10; i++) {
			asyncTaskService.excuteTask1(i);
			asyncTaskService.excuteTask2(i);
		}
		context.close();
	}
}
