package com.wei.learncode.thread.pool;

/**
 * @Author: weizz
 * @Date: 2019/6/28 16:36
 * @Description:
 * @Version:1.0
 */
public class Main3 {

    public  volatile  int i = 0;
    public void set(int value){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i = value;
    }
    public int get(){
        return i;
    }
    public static void main(String[] args) {
        Main3 main3 = new Main3();
        new Thread(new Runnable() {
            @Override
            public void run() {
                main3.set(10);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(main3.get());
            }
        }).start();
    }
}
