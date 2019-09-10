package com.wei.learncode.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//声明当前类是Spring管理的一个类
@Service
public class UseFunctionService {

	//将FunctionService实体Bean注入到UseUseFunctionService中
	@Autowired
	FunctionService functionService;
	
    public String say(String word){
    	return functionService.say(word);
    } 
}
