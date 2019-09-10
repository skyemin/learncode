package com.wei.learncode.spring.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

	private String beanName;
	private ResourceLoader loader;
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.loader = resourceLoader;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
	public void outputResult(){
		
		System.out.println("Bean的名称是:"+beanName);
		Resource resource = loader.getResource("classpath:com/wei/aware/test.txt");
		try {
			System.out.println("文件内容:"+IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
