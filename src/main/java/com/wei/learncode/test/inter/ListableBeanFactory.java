package com.wei.learncode.test.inter;

import org.springframework.context.annotation.Bean;

/**
 * @Author: weizz
 * @Date: 2019/7/4 9:38
 * @Description:
 * @Version:1.0
 */
public interface ListableBeanFactory extends BeanFactory {
    String[] getBeanDefinitionNames();
}
