package com.wei.learncode.completableFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * @Author: skye
 * @Date: 2020/5/26 15:55
 * @Description:
 * @Version:1.0
 */
public class Test {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add("test"+i);
        }
        List<String> list1 = list.subList(0, 300);
        List<String> list2 = list.subList(300, 600);
        List<String> list3 = list.subList(600, 1000);

        CompletableFuture<Integer> t1 =
                CompletableFuture.supplyAsync(() -> {
                    System.out.println("list1在处理..."+list1.size());
                    return  list1.size();
                });

        CompletableFuture<Integer> t2 =
                CompletableFuture.supplyAsync(() -> {
                    System.out.println("list1在处理..."+list2.size());
                    return  list1.size();
                });
        CompletableFuture<Integer> t3 =
                CompletableFuture.supplyAsync(() -> {
                    System.out.println("list1在处理..."+list3.size());
                    return  list1.size();
                });
        CompletableFuture.allOf(t1, t2, t3).get();

    }
}
