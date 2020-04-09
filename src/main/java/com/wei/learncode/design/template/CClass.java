package com.wei.learncode.design.template;

/**
 * @Author: skye
 * @Date: 2020/4/2 18:40
 * @Description:
 * @Version:1.0
 */
public class CClass {

    public static void main(String[] args) {

        BClass b = new BClass();
        b.process(new ICallback() {
            @Override
            public void methodToCallback() {
                System.out.println(12312313);
            }
        });
    }
}
