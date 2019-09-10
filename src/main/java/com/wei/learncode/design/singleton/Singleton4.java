package com.wei.learncode.design.singleton;

/**
 * @Author: weizz
 * @Date: 2019/3/19 11:26
 * @Description: 双重校验锁
 * @Version:1.0
 */
public class Singleton4 {

    private Singleton4(){

    }
    private static Singleton4 s;
    public static Singleton4 getInstance(){
        if(s == null){
            synchronized (Singleton4.class){
                if(s == null){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    s = new Singleton4();
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton4.getInstance());
                }
            }).start();
        }
    }
}
