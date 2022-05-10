package com.wei.learncode.design.template;

public class CClass{


    public void c(ICallback callback,BClass bClass){
        new Thread(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            callback.methodToCallback(bClass,789);

        }).start();
    }

}
