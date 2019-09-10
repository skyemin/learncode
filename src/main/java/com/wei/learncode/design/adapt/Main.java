package com.wei.learncode.design.adapt;

/**
 * @Author: weizz
 * @Date: 2019/3/20 17:24
 * @Description:
 * @Version:1.0
 */
public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setAdapt(new Adapt());
        phone.charge();
    }
}
