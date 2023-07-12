package com.wei.learncode.geekAlgorithm.day14;

public class Singleton {

    private static volatile Singleton singleton = null;
    private Singleton(){

    }
    private static Singleton getObject(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    return new Singleton();
                }
            }
        }
        return singleton;
    }
}
