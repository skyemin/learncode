package com.wei.learncode.spring.source;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

@Data
public class Resp {

    private String projectFid;
    private String projectName;
    private List<Role> roles;

    @Data
    public static class Role {
        private Integer roleType;
        private String name;
    }


    public static void main(String[] args) throws InterruptedException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        Resp resp = new Resp();
        try {
            CompletableFuture labelFuture = CompletableFuture.runAsync(() -> {
                try {
                    resp.setProjectFid("123");
                    int i = 1/0;
                    resp.setProjectName("456");
                }catch (Exception e){
                    e.printStackTrace();
                    atomicBoolean.set(false);
                    throw new RuntimeException("Computation error!");
                }

            });
        labelFuture.exceptionally(new Function<Throwable, Void>() {
            @Override
            public Void apply(Throwable t) {
                System.out.println("执行失败！"+t);
                return null;
            }
        });
        labelFuture.whenComplete((t,u)->{
            System.out.println(123);
            System.out.println(t);
            System.out.println(u);
        });
            Thread.sleep(1000);
            if(atomicBoolean.get()){
                System.out.println(resp.toString());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
