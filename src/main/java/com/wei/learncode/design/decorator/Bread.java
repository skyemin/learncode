package com.wei.learncode.design.decorator;

/**
 * @Author: weizz
 * @Date: 2019/3/20 16:49
 * @Description:
 * @Version:1.0
 */
public class Bread extends Food{
    private Food food;
    public Bread(Food food){
        this.food = food;
    }
    public String make(){
        return food.make()+"面包";
    }
}
