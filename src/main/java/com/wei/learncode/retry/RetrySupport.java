package com.wei.learncode.retry;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;

public class RetrySupport {

    public static boolean canRetryable(Throwable throwable, Retryable retryable) {
        ArrayList<Class<? extends Throwable>> includeExceptions = Lists.newArrayList(Arrays.asList(retryable.includes()));
        includeExceptions.add(retryable.retryIfException());
        for (Class<? extends Throwable> type : includeExceptions) {
            if (type.isAssignableFrom(throwable.getClass())) {
                return true;
            }
        }

        Class<? extends Throwable>[] excludes = retryable.excludes();
        for (Class<? extends Throwable> type : Arrays.asList(excludes)) {
            if (type.isAssignableFrom(throwable.getClass())) {
                return false;
            }
        }
        return false;
    }
}

