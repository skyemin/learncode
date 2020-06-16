package com.wei.learncode.design.builder;

import org.springframework.util.StringUtils;

/**
 * @Author: skye
 * @Date: 2020/5/19 16:34
 * @Description: 第二种,构造函数为空,通过set方法设值
 * @Version:1.0
 */
public class ResourceConfig2 {

    private String name;
    private int maxTotal = 8;
    private int minTotal = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(StringUtils.isEmpty(name)){
            throw new Exception("name must not be null...");
        }
        this.name = name;
    }

    public int getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(int maxTotal) throws Exception {
        if(maxTotal <0){
            throw new Exception("maxTotal must gt 0...");
        }
        this.maxTotal = maxTotal;
    }

    public int getMinTotal() {
        return minTotal;
    }

    public void setMinTotal(int minTotal) throws Exception {
        if(minTotal <0){
            throw new Exception("minTotal must gt 0...");
        }
        this.minTotal = minTotal;
    }

    public static void main(String[] args) throws Exception {

        ResourceConfig2 resourceConfig = new ResourceConfig2();
        resourceConfig.setName("测试");
        resourceConfig.setMaxTotal(10);
        resourceConfig.setMinTotal(0);
    }
}
