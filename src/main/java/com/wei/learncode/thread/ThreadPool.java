package com.wei.learncode.thread;

public interface ThreadPool {

    //提交任务到线程池
    void execute(Runnable runnable);
    //关闭线程池
    void shutdown();
    //获取初始值大小
    int getInitSize();
    //获取最大值
    int getMaxSize();

}
