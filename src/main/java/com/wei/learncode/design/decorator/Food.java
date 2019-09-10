package com.wei.learncode.design.decorator;

/**
 * @Author: weizz
 * @Date: 2019/3/20 16:47
 * @Description:
 * @Version:1.0
 */
public class Food {

    private String name;
    public Food(){

    }
    public Food(String name){
        this.name = name;
    }
    public String make(){
        return name;
    }
}
