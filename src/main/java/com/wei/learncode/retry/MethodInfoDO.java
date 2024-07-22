package com.wei.learncode.retry;

import lombok.Data;

import java.util.Date;

@Data
public class MethodInfoDO {

    private Long id;

    private String uniqueKey;

    private String appName;

    private String ip;

    private String className;

    private String methodName;

    private String parameterTypes;

    private String arguments;

    private int retryTimes;

    private int currentRetryTimes;

    private Date nextRetryTime;

    private String exceptionDesc;

    private RetryStatusEnum retryStatus;

    private String traceId;

    private String tenantId;

    private Date gmtCreate;

    private Date gmtModified;
}

