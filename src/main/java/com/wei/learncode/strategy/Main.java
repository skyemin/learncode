package com.wei.learncode.strategy;

/**
 * @Author: weizz
 * @Date: 2019/5/31 9:34
 * @Description:
 * @Version:1.0
 */
public class Main {

    public static void main(String[] args) {
        Buyer buyer = new VipBuyer();
        Count count = new Count(buyer);
        System.out.println(count.getPrice());
    }
}
