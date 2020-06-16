package com.wei.learncode.design.builder;

import org.springframework.util.StringUtils;

/**
 * @Author: skye
 * @Date: 2020/5/20 9:45
 * @Description:
 * @Version:1.0
 */
public class Builder2 {
    public String name;
    public int maxTotal = 10;
    public int minTotal = 0;


    public Builder2 setName(String name) {
        this.name = name;
        return this;
    }


    public Builder2 setMaxTotal(int maxTotal) {
        this.maxTotal = maxTotal;
        return this;
    }

    public Builder2 setMinTotal(int minTotal) {
        this.minTotal = minTotal;
        return this;
    }
    public ResourceConfig3 build() throws Exception {
        if(StringUtils.isEmpty(name)){
            throw new Exception("name must not be null...");
        }
        if(maxTotal <0){
            throw new Exception("maxTotal must gt 0...");
        }
        if(minTotal <0){
            throw new Exception("minTotal must gt 0...");
        }
        return new ResourceConfig3(this);
    }
}
