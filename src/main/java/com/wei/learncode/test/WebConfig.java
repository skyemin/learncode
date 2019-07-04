package com.wei.learncode.test;

import com.wei.learncode.test.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: weizz
 * @Date: 2019/7/3 15:02
 * @Description:
 * @Version:1.0
 */
@Configuration
@ComponentScan("com.wei.learncode.test")
public class WebConfig {

   /* @Bean("myUser")
    //默认方法名就是bean的名字
    public User user(){
        return new User("张三",18);
    }*/
}
