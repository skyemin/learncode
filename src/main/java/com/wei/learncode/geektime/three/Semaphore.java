package com.wei.learncode.geektime.three;

import java.util.Queue;

/**
 * @Author: skye
 * @Date: 2019/11/4 11:45
 * @Description:
 * @Version:1.0
 */
public class Semaphore{
    // 计数器
    int count;
    // 等待队列
    Queue queue;
    // 初始化操作
    Semaphore(int c){
        this.count=c;
    }
    //
    void down(){
        this.count--;
        if(this.count<0){
            // 将当前线程插入等待队列
            // 阻塞当前线程
        }
    }
    void up(){
        this.count++;
        if(this.count<=0) {
            // 移除等待队列中的某个线程 T
            // 唤醒线程 T
        }
    }
}