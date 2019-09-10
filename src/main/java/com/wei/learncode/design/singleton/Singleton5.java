package com.wei.learncode.design.singleton;

/**
 * @Author: weizz
 * @Date: 2019/3/19 11:38
 * @Description:静态内部类
 * @Version:1.0
 */
public class Singleton5 {

    private Singleton5(){

    }
    private static class SingletonHolder{
        private static final Singleton5 s = new Singleton5();
    }
    public static Singleton5 getInstance(){
        return SingletonHolder.s;
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton5.getInstance());
                }
            }).start();
        }
    }
}
