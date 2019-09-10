package com.wei.learncode.design.singleton;

public class Singleton6{
    private Singleton6(){

    }
    public static Singleton6 getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private static enum Singleton{
        INSTANCE;

        private Singleton6 singleton;
        //JVM会保证此方法绝对只调用一次
        private Singleton(){
            singleton = new Singleton6();
        }
        public Singleton6 getInstance(){
            return singleton;
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton6.getInstance());
                }
            }).start();
        }
    }
}
