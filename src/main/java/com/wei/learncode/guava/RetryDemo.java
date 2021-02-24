package com.wei.learncode.guava;

import com.github.rholder.retry.Retryer;
import com.github.rholder.retry.RetryerBuilder;
import com.github.rholder.retry.StopStrategies;
import com.github.rholder.retry.WaitStrategies;
import org.apache.commons.lang.StringUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/2/4 17:47
 */
public class RetryDemo {

    public static String test(){
        System.out.println("执行了...");
        return null;
    }
    public static void main(String[] args) {


        Retryer<String> retryer = RetryerBuilder.<String>newBuilder()
                .retryIfResult(StringUtils::isEmpty)
                .withWaitStrategy(WaitStrategies.fixedWait(10, TimeUnit.SECONDS))
                .withStopStrategy(StopStrategies.stopAfterAttempt(5))
                .build();
        try {
            retryer.call(() -> test());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
