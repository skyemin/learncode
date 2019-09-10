package com.wei.learncode.spring.di;

import org.springframework.stereotype.Service;

//声明当前类是Spring管理的一个Bean
@Service
public class FunctionService {
	public String say(String word){
		return word;
	}
}
