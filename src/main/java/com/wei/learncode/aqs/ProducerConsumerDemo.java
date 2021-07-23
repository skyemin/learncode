package com.wei.learncode.aqs;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/7/23 16:28
 */
public class ProducerConsumerDemo {


    final Lock lock = new ReentrantLock();
    final Condition notFull = lock.newCondition();
    final Condition notEmpty = lock.newCondition();

    final Object[] items = new Object[100];
    int put,take,count;

    public void put(Object o){
        lock.lock();
        try {
            while (count == items.length){
                //队列已满,等待知道not full才能继续生产
                notFull.await();
            }
            items[put] = o;
            if(++put == items.length){
                put = 0;
            }
            count++;
            notEmpty.signal();
        } catch (Exception e) {
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
            o = items[take];
            if(++take == count){
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
        ProducerConsumerDemo demo = new ProducerConsumerDemo();
        demo.put("123");
        demo.put("456");
        String o = (String) demo.get();
        System.out.println(o);
    }
}
