package com.wei.learncode.retry;

import lombok.Getter;

@Getter
public enum RetryStatusEnum {

    RETRYING("retrying", "重试中"),
    RETRY_SUCCESS("retrySuccess", "重试成功"),
    RETRY_FAILED("retryFailed", "重试失败");

    RetryStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private final String code;
    private final String desc;

}