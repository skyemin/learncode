package com.wei.learncode.closeable;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Executable;

/**
 * @Author: skye
 * @Date: 2020/4/16 13:54
 * @Description:
 * @Version:1.0
 */
public class Test implements Closeable {

    public void test(){
        System.out.println("invoke test method...");
    }
    @Override
    public void close() throws IOException {
        System.out.println("close is processing...");
    }

    public static void main(String[] args) {
        try(Test test = new Test()) {
            test.test();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
