package com.wei.learncode.jvm;

import lombok.extern.slf4j.Slf4j;

import java.lang.ref.SoftReference;

@Slf4j
public class TestType {

    public static void main(String[] args) {
            Object obj = new Object();
            SoftReference<Object> soft = new SoftReference<>(obj);
            obj = null;
            log.info("{}",soft.get());
            System.gc();
            log.info("{}",soft.get());
        }
    }

