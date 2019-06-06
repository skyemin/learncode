package com.wei.learncode.strategy;

/**
 * @Author: weizz
 * @Date: 2019/5/31 9:43
 * @Description:
 * @Version:1.0
 */
public class Count {
    private Buyer buyer;

    public Count(Buyer buyer){
        this.buyer = buyer;
    }

    public int getPrice(){
        return this.buyer.getPrice();
    }
}
