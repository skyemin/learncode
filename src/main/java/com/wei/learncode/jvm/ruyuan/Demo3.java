package com.wei.learncode.jvm.ruyuan;

import java.util.ArrayList;
import java.util.List;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/20 15:42
 */
public class Demo3 {

    public static void main(String[] args) throws InterruptedException {
        List<Data> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(new Data());
        }
        Thread.sleep(1*60*60*1000);
    }
    public static class Data{

    }
}
