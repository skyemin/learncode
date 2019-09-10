package com.wei.learncode.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Author: weizz
 * @Date: 2019/8/29 11:37
 * @Description:
 * @Version:1.0
 */
public class Test6 {

    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java","Python","scala","Shell","R");
        filterTest(languages,x->x.startsWith("J"));//Java
        filterTest(languages,x -> x.endsWith("a"));//Java,scala
        filterTest(languages,x -> true);//Java,Python,scala,Shell,R
        filterTest(languages,x -> false);//
        filterTest(languages,x -> x.length() > 4);//Python,scala,Shell,
    }

    public static void filterTest(List<String> languages, Predicate<String> condition) {
        languages.stream().filter(x -> condition.test(x)).forEach(x -> System.out.println(x + " "));
    }

    public static void test(List<String> persons,Predicate<String> predicate){
        persons.stream().filter(x -> predicate.test(x)).forEach(x -> System.out.println(x));
    }
}

