package com.wei.learncode.test;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: skye
 * @Date: 2019/11/15 15:47
 * @Description:
 * @Version:1.0
 */
public class Test {

    public static void main(String[] args) {

        String a = "123";
        String b = new String("123");
        String c = b.intern();
        System.out.println(a == b);
    }
}
