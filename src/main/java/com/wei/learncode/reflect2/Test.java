package com.wei.learncode.reflect2;

import lombok.Data;

@Data
public class Test {

    private int a;

    public void test(Test test){
        System.out.println(1);
    }
}
