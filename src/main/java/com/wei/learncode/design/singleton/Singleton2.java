package com.wei.learncode.design.singleton;


/**
 * @Author: weizz
 * @Date: 2019/3/19 11:08
 * @Description: 饿汉式
 * @Version:1.0
 */
public class Singleton2 {

    private Singleton2(){

    }
    private static Singleton2 s = new Singleton2();
    public static Singleton2 getInstance(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return s;
    }

    public static void main(String[] args) {
        for (int i =0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton2.getInstance());
                }
            }).start();
        }
    }
}
