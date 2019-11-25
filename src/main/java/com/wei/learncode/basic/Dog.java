package com.wei.learncode.basic;

import org.springframework.scheduling.annotation.AnnotationAsyncExecutionInterceptor;

/**
 * @Author: weizz
 * @Date: 2019/7/9 10:28
 * @Description:
 * @Version:1.0
 */
public class Dog extends Animal{

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("狗在吃");
    }
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
    }
}
