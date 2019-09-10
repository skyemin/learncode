package com.wei.learncode.spring.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

	@Async
	public void excuteTask1(int i){
		System.out.println("执行任务1:"+i);
	}
	@Async
	public void excuteTask2(int i){
		System.out.println("执行任务2:"+i);
	}
}
