package com.wei.learncode.thread.basic;

/**
 * @Author: weizz
 * @Date: 2019/4/30 10:50
 * @Description:
 * @Version:1.0
 */
public class Singleton {
    private static Singleton singleton;
    private static int a;


    private Singleton(){
        this.a = 1;
    }
    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton= new Singleton();
                }
            }
        }
        return singleton;
    }

  /*  public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton.getInstance().a);
                }
            }).start();
        }
    }*/
}
