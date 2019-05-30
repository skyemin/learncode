package com.wei.learncode.package1;

/**
 * @Author: weizz
 * @Date: 2019/5/16 17:25
 * @Description:
 * @Version:1.0
 */
public class Student {
    //default  包访问权限
    //protected  包访问权限 但子类可以用
    //public  所有权限
    //private 本类
    protected String name;

    public void test(){
        System.out.println(name);
    }
    static class A{

    }
}
