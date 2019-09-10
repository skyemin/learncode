package com.wei.learncode.design.adapt;

/**
 * @Author: weizz
 * @Date: 2019/3/20 17:18
 * @Description:
 * @Version:1.0
 */
public class Phone {

    private Adapt adapt;
    public static final int V = 220;

    public void charge(){
        adapt.change();
    }
    public void setAdapt(Adapt adapt){
        this.adapt = adapt;
    }
}
