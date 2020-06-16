package com.wei.learncode.design.builder;

import org.springframework.util.StringUtils;

/**
 * @Author: skye
 * @Date: 2020/5/19 16:34
 * @Description: 第一种,所有参数放在构造方法,当参数过多时,构造方法很长
 * @Version:1.0
 */
public class ResourceConfig {

    private String name;
    private int maxTotal = 8;
    private int minTotal = 0;

    public ResourceConfig(String name,int maxTotal,int minTotal) throws Exception {

        if(StringUtils.isEmpty(name)){
            throw new Exception("name must not be null...");
        }
        this.name = name;
        if(maxTotal <0){
            throw new Exception("maxTotal must gt 0...");
        }
        this.maxTotal = maxTotal;
        if(minTotal <0){
            throw new Exception("minTotal must gt 0...");
        }
        this.minTotal = minTotal;
    }

    public static void main(String[] args) {
        try {
            ResourceConfig resourceConfig = new ResourceConfig("测试",-1,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
