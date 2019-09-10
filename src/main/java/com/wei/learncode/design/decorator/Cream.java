package com.wei.learncode.design.decorator;

/**
 * @Author: weizz
 * @Date: 2019/3/20 16:55
 * @Description:
 * @Version:1.0
 */
public class Cream extends Food{
    private Food food;
    public Cream(Food food){
        this.food = food;
    }
    public String make(){
        return food.make()+"奶油";
    }
}
