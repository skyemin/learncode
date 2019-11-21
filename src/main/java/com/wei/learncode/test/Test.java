package com.wei.learncode.test;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
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

        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (true) {
            list.add(i++);
        }
    }
}
