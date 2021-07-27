package com.wei.learncode.design.templatemethod;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/7/27 11:33
 */
public abstract class AbstractTemplate {

    public void templateMethod(String type){
        init();
        apply(type);
        end();
    }

    protected void init() {
        System.out.println("init...");
    }
    protected abstract void apply(String type);
    protected void end() {
        System.out.println("end...");
    }

}
