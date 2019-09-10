package com.wei.learncode.singleton;

/**
 * @Author: weizz
 * @Date: 2019/8/14 9:54
 * @Description:
 * @Version:1.0
 */
public class Singleton2 {

    private Singleton2(){

    }
    private static  Singleton2 s = new Singleton2();

    public  static Singleton2 getInstance(){
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
