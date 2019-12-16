package com.wei.learncode.test;

import lombok.Data;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: weizz
 * @Date: 2019/7/3 19:18
 * @Description:
 * @Version:1.0
 */
public class Student extends Person{

    public Student(String name) {
        super(name);
    }
    public static void main(String[] args) {
        Student s = new Student("");
        Person p = new Student("");
        s.test2();
    }
}
