package com.wei.learncode.spring.cycleDependcy;

/**
 * @Author: skye
 * @Date: 2020/6/16 14:41
 * @Description:
 * @Version:1.0
 */
public class A {
    private B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
