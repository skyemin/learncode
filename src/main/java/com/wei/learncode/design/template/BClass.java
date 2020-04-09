package com.wei.learncode.design.template;

/**
 * @Author: skye
 * @Date: 2020/4/2 18:39
 * @Description:
 * @Version:1.0
 */
public class BClass {

    public void process(ICallback callback){
        callback.methodToCallback();
    }
}
