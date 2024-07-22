package com.wei.learncode.retry;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Retryable {


    /**
     * 重试模式 同步重试或者异步重试
     *
     * @return
     */
    RetryModeEnum retryMode();


    /**
     * 需要重试的异常类型
     *
     * @return
     */
    Class<? extends Throwable> retryIfException() default Exception.class;

    /**
     * 最多重试的次数
     *
     * @return
     */
    int maxRetryAttemptNumber() default 3;

    /**
     * 需要重试的异常列表
     *
     * @return
     */
    Class<? extends Throwable>[] includes() default {};

    /**
     * 不需要重试的异常列表
     *
     * @return
     */
    Class<? extends Throwable>[] excludes() default {};

    /**
     * 重试的spel表达式 若返回的结果匹配了该表达式，则进行重试
     *
     * @return
     */
    String retryIfResultExpression() default "";

    /**
     * 重试的延迟时间
     *
     * @return
     */
    int delay() default 10;

    /**
     * 重试的延迟时间单位
     *
     * @return
     */
    TimeUnit timeUnit() default TimeUnit.MINUTES;
}
