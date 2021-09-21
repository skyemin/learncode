package com.wei.learncode.aqs;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: skye
 * @Date: 2021/9/14 11:12
 * @Description:
 * @Version:1.0
 */
public class Test {

    ReentrantLock lock = new ReentrantLock();
    Condition notFull = lock.newCondition();
    Condition notEmpty = lock.newCondition();
    int put,take,count;
    Object[] item = new Object[100];

    public void put(Object o){
        lock.lock();
        try {
            while(count == item.length){
                notFull.await();
            }
            item[put] = o;
            if(++put == item.length){
                put = 0;
            }
            count++;
            notEmpty.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
    public Object get(){
        Object o = null;
        lock.lock();
        try {
            while(count == 0){
                notEmpty.await();
            }
            o = item[take];
            if(++take == item.length){
                take = 0;
            }
            count--;
            notFull.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        return o;
    }

    public static void main(String[] args) {
        Test demo = new Test();
        demo.put("123");
        demo.put("456");
        String o = (String) demo.get();
        String s = (String) demo.get();
        System.out.println(o);
        System.out.println(s);
    }
}
