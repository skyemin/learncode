package com.wei.learncode.protobuf;

import io.protostuff.Tag;

/**
 * @Author: skye
 * @Date: 2019/11/22 10:38
 * @Description:
 * @Version:1.0
 */
public class Student {

    @Tag(1)
    private Integer id;
    @Tag(2)
    private String name;
    @Tag(3)
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
}
