package com.wei.learncode.inteview;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintABC {

    private int times;
    private int state;
    private Lock lock = new ReentrantLock();

    public PrintABC(int times) {
        this.times = times;
    }
    void printA(){
        print("A",0);
    }
    void printB(){
        print("B",1);
    }
    void printC(){
        print("C",2);
    }

    void print(String name,int stateNow){
        for (int i = 0; i < times;) {
            lock.lock();
            if(stateNow == state % 3){
                state++;
                i++;
                System.out.println(Thread.currentThread().getName()+":"+name);
            }
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        PrintABC printABC = new PrintABC(10);
        new Thread(printABC::printA).start();
        new Thread(printABC::printB).start();
        new Thread(printABC::printC).start();
    }
}
