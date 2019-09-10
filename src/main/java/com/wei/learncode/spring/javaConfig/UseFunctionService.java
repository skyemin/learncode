package com.wei.learncode.spring.javaConfig;


public class UseFunctionService {

	FunctionService functionService;
	
	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}

	public String say(String word){
    	return functionService.say(word);
    } 
}
