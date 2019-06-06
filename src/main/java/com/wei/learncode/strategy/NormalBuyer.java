package com.wei.learncode.strategy;

/**
 * @Author: weizz
 * @Date: 2019/5/31 9:42
 * @Description:
 * @Version:1.0
 */
public class NormalBuyer implements Buyer{
    @Override
    public int getPrice() {
        return 100;
    }
}
