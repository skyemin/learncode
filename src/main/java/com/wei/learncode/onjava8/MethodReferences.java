package com.wei.learncode.onjava8;

import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Callable {                        // [1]
    void call(String s);
}

class Describe {
    void show(String msg) {                   // [2]
        System.out.println(msg);
    }
}

public class MethodReferences {
    static void hello(String name) {          // [3]
        System.out.println("Hello, " + name);
    }
    static class Description {
        String about;
        Description(String desc) { about = desc; }
        void help(String msg) {                 // [4]
            System.out.println(about + " " + msg);
        }
    }
    static class Helper {
        static void assist(String msg) {        // [5]
            System.out.println(msg);
        }
    }
    public static void main(String[] args) {
        //System.out.println(        new BigDecimal("1899").compareTo(new BigDecimal("1899")) > 0);
        Integer a = 1;
        System.out.println(a == 1);
    }
}
