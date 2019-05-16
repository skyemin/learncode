package com.wei.learncode.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: weizz
 * @Date: 2019/4/30 16:01
 * @Description:
 * @Version:1.0
 */
public class Test1 {
    static class Test2{

    }

    public static void main(String[] args) {
        List<Test2> list = new ArrayList<>();
        while (true){
            list.add(new Test2());
        }
    }
}
