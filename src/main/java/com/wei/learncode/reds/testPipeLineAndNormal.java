package com.wei.learncode.reds;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Logger;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/5 14:19
 */
public class testPipeLineAndNormal {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        try {
            testPipeLineAndNormal(jedis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void testPipeLineAndNormal(Jedis jedis)
            throws InterruptedException {
        Logger logger = Logger.getLogger("javasoft");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            jedis.set(String.valueOf(i), String.valueOf(i));
        }
        long end = System.currentTimeMillis();
        logger.info("the jedis total time is:" + (end - start));

        Pipeline pipe = jedis.pipelined(); // 先创建一个 pipeline 的链接对象
        long start_pipe = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            pipe.set(String.valueOf(i), String.valueOf(i));
        }
        pipe.sync(); // 获取所有的 response
        long end_pipe = System.currentTimeMillis();
        logger.info("the pipe total time is:" + (end_pipe - start_pipe));

        BlockingQueue<String> logQueue = new LinkedBlockingQueue<String>();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            logQueue.put("i=" + i);
        }
        long stop = System.currentTimeMillis();
        logger.info("the BlockingQueue total time is:" + (stop - begin));
    }
}
