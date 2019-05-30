package com.wei.learncode.package1;

/**
 * @Author: weizz
 * @Date: 2019/5/16 17:28
 * @Description:
 * @Version:1.0
 */
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        s.test();
        Student.A a = new Student.A();
    }
}
