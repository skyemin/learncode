package com.wei.learncode.design.adapt;

/**
 * @Author: weizz
 * @Date: 2019/3/20 17:21
 * @Description:适配器
 * @Version:1.0
 */
public class Adapt {

    public void change(){
        System.out.println("开始充电...");
        System.out.println("原始电压:"+Phone.V);
        System.out.println("变压后的电压:"+(Phone.V-200));
    }
}
