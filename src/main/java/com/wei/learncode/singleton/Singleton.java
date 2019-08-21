package com.wei.learncode.singleton;

/**
 * @Author: weizz
 * @Date: 2019/8/14 9:54
 * @Description:
 * @Version:1.0
 */
public class Singleton {

    private Singleton(){

    }
    private static volatile Singleton s = null;

    public  static Singleton getInstance(){
        if(s == null){
            synchronized (Singleton.class){
                if(s == null){
                    s = new Singleton();
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
                    System.out.println(s.getInstance().hashCode());
                }
            }).start();
        }
    }
}
