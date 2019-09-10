package com.wei.learncode.spring.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public FunctionService functionService(){
		return new FunctionService();
	}
	/*@Bean
	public UseFunctionService useFunctionService(){
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());
		return useFunctionService;
	}*/
	//在Spring容器中,只要容器中存在某个Bean,就可以在在另个Bean的声明方法参数中注入
	@Bean
	public UseFunctionService useFunctionService(FunctionService functionService){
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService);
		return useFunctionService;
	}
	
}
