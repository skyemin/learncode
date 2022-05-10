package com.wei.learncode.design.template;

/**
 * @Author: skye
 * @Date: 2020/4/2 18:39
 * @Description:
 * @Version:1.0
 */
public class BClass {

    public static void main(String[] args) {

        BClass b = new BClass();
        ICallback callback = new ICallback() {
            @Override
            public void methodToCallback(BClass bClass, int value) {
              b.test(value);
            }
        };
        CClass C = new CClass();
        C.c(callback,b);
        System.out.println("主线程完成");
    }

    private void test(int value ) {
        System.out.println("开始执行回调回来的"+value);
    }


}
