package com.wei.learncode.stream;

/**
 * @Author: weizz
 * @Date: 2019/4/16 14:57
 * @Description:
 * @Version:1.0
 */
public class PersonModel {

    private String name;
    private Integer age;
    private String sex;
    public PersonModel(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public PersonModel() {

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
