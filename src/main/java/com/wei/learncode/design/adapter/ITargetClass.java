package com.wei.learncode.design.adapter;

/**
 * @Author: skye
 * @Date: 2020/3/9 9:45
 * @Description:  类适配器,基于继承
 * @Version:1.0
 */

//ITarget表示要转化成的接口定义,Adaptee是一组不兼容ITarget接口定义的接口,Adaptor将其转化成ITarget接口定义

public interface ITargetClass {
    void f1();
    void f2();
    void f3();
}

class Adaptee{
    public void fa(){

    }
    public void fb(){

    }
    public void fc(){

    }
}
class Adaptor extends Adaptee implements ITargetClass {

    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        //重新实现f2
    }

    @Override
    public void f3() {
        //这里fc不需要实现,直接继承Adaptee,这是和对象适配器最大的不同
    }
}
