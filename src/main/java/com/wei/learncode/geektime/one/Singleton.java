package com.wei.learncode.geektime.one;

/**
 * @Author: skye
 * @Date: 2019/10/31 15:04
 * @Description:  双重检查的单例(编译器优化带来的有序性问题)
 * @Version:1.0
 */
public class Singleton {

    //构造方法私有化
    private Singleton(){

    }
    private volatile static Singleton singleton;

    //静态方法中只能调用静态变量,不能调用成员变量
    //非静态方法可以调用静态变量,也可以调用成员变量
    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    //1.分配一块内存
                    //2.在内存上创建对象
                    //3.将内存地址指向对象
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
