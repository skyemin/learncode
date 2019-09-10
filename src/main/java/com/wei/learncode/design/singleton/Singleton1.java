package com.wei.learncode.design.singleton;
/**
 * Created by skye on 2019/3/18.
 */

/**
 * @Author: weizz
 * @Date: 2019/3/18 18:24
 * @Description:懒汉式
 * @Version:1.0
 */
public class Singleton1 {

    //构造方法私有化
    private Singleton1(){

    };
    //懒汉式(有线程安全问题)
    private static Singleton1 singleton;
    public static Singleton1 getInstance() {
        if(singleton == null){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singleton = new Singleton1();
        }
        return singleton;
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton1.getInstance());
                }
            }).start();
        }
    }
}
