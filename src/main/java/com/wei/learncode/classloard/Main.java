package com.wei.learncode.classloard;

/**
 * @Author: weizz
 * @Date: 2019/4/29 9:18
 * @Description:
 * @Version:1.0
 */
//加载阶段,虚拟机需要完成三件事情
//1.通过一个类的全限定名获取定义此类的二进制字节流
//2.将这个字节流所代表的静态存储结构转化为方法区的运行数据结构
//3.在内存中生成一个代表这个类的java.lang.Class对象,作为方法区这个类的各种数据的访问入口
//验证阶段
//准备阶段(静态变量赋初始值  final修饰会赋上编译后的值)
//解析阶段
//初始化阶段
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //new对象
        //Simple s = new Simple();
        //调用静态变量(final修饰不会初始化)
        System.out.println(Simple.a);
        //调用静态方法
        //test();
        //反射
        //Class.forName("com.wei.learncode.classloard.Simple");
        //System.out.println(Simple.b);
    }
}
