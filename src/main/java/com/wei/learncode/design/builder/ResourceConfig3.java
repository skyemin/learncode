package com.wei.learncode.design.builder;

import org.springframework.util.StringUtils;

/**
 * @Author: skye
 * @Date: 2020/5/19 17:21
 * @Description:
 * @Version:1.0
 */
public class ResourceConfig3 {

    private String name;
    private int maxTotal ;
    private int minTotal ;

    @Override
    public String toString() {
        return "ResourceConfig3{" +
                "name='" + name + '\'' +
                ", maxTotal=" + maxTotal +
                ", minTotal=" + minTotal +
                '}';
    }

    public ResourceConfig3(Builder2 builder){
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.minTotal = builder.minTotal;
    }

    public static class Builder{
        private String name;
        private int maxTotal = 10;
        private int minTotal = 0;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public Builder setMaxTotal(int maxTotal) {
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setMinTotal(int minTotal) {
            this.minTotal = minTotal;
            return this;
        }
        /*public ResourceConfig3 build() throws Exception {
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
        }*/
    }

    public static void main(String[] args) throws Exception {

        ResourceConfig3 test = new Builder2().setName("test").setMaxTotal(100).setMinTotal(0).build();
        System.out.println(test.toString());
    }
}
