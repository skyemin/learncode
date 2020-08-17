package com.wei.learncode.spring.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//声明当前类是一个配置类
@Configuration
//自动扫描包名下所有使用@Service,@Component,@Repository,@Controller的类,并注册Bean
@ComponentScan("com.wei.learncode.spring.di")
public class DiConfig {
	
}
