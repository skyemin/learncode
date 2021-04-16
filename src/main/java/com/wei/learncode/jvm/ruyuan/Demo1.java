package com.wei.learncode.jvm.ruyuan;

import java.util.ArrayList;
import java.util.List;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/16 16:10
 */
public class Demo1 {

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(30000);
        while (true){
            loadData();
        }
    }

    private static void loadData() throws InterruptedException {
        List list = new ArrayList();
        byte[] data = null;
        for (int i = 0; i < 50; i++) {
            data = new byte[100*1024];
            list.add(data);
        }
        Thread.sleep(1000);
    }


}
