package com.wei.learncode.spring.scope;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppEnvironment {
    public AppEnvironment() {
        System.out.println("AppEnvironment init");
    }

    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        list.add(1L);
        System.out.println(list.contains(1L));
        System.out.println(list.contains(null));
    }
}
