package com.wei.learncode.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: skye
 * @Date: 2020/11/7 15:30
 * @Description: lock.newCondition()实现多线程顺序打印
 * @Version:1.0
 */
public class TestPrint {

    int num = 1;
    Lock lock =  new ReentrantLock();
    Condition c1 = lock.newCondition();
    Condition c2 = lock.newCondition();
    Condition c3 = lock.newCondition();

    public void print1(){
        lock.lock();
        try {
            if(num == 1){
                System.out.println("A");
                num = 2;
                c2.signal();
            }else{
                try {
                    c1.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }
    public void print2(){
        lock.lock();
        try {
            if(num == 2){
                System.out.println("B");
                num = 3;
                c3.signal();
            }else{
                try {
                    c2.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }
    public void print3(){
        lock.lock();
        try {
            if(num == 3){
                System.out.println("C");
                num = 1;
                c1.signal();
            }else{
                try {
                    c3.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        TestPrint print = new TestPrint();
        new Thread(()->{
            while (true){
                print.print1();
            }
        }).start();
        new Thread(()->{
            while (true){
                print.print2();
            }
        }).start();
        new Thread(()->{
            while (true){
                print.print3();
            }
        }).start();
    }
}
