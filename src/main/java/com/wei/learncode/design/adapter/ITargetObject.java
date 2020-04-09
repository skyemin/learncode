package com.wei.learncode.design.adapter;

/**
 * @Author: skye
 * @Date: 2020/3/9 9:45
 * @Description:  类适配器,基于继承
 * @Version:1.0
 */

//ITarget表示要转化成的接口定义,Adaptee是一组不兼容ITarget接口定义的接口,Adaptor将其转化成ITarget接口定义

public interface ITargetObject {
    void f1();
    void f2();
    void f3();
}

class AdapteeObject{
    public void fa(){

    }
    public void fb(){

    }
    public void fc(){

    }
}

class AdaptorObject implements ITargetObject {

    private AdapteeObject adapteeObject;
    @Override
    public void f1() {
        adapteeObject.fa();
    }

    @Override
    public void f2() {
        //重新实现f2
    }

    @Override
    public void f3() {
        adapteeObject.fc();
    }
}
