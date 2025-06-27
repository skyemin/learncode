package com.wei.learncode.ali;

import java.util.concurrent.CountDownLatch;

public class BatchTask {

    ///批次数
    private static final int batchNum = 10;
    //一批大小
    private static final int batchSize = 10;

    public static void main(String[] args) {
        for (int i = 1; i <=batchNum ; i++) {
            CountDownLatch latch = new CountDownLatch(batchSize);
            for (int j = 1; j <= batchSize; j++) {
                int taskNumber = (i-1) * batchSize + j;
                new Thread(new Task(taskNumber,latch)).start();
            }
            try {
                latch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("done...");
    }
    static class Task implements Runnable{
        private int taskNumber;
        private CountDownLatch latch;

        public Task(int taskNumber,CountDownLatch latch){
            this.taskNumber = taskNumber;
            this.latch = latch;
        }
        @Override
        public void run() {
            System.out.println("current task:"+taskNumber);
            latch.countDown();
        }
    }
}
