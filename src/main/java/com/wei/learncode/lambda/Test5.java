package com.wei.learncode.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: weizz
 * @Date: 2019/8/29 11:30
 * @Description:
 * @Version:1.0
 */
public class Test5 {
  /*  要求：实现抽象方法的参数列表和返回值类型，必须与方法引用的方法的参数列表和返回值类型保持一致！
    方法引用：使用操作符“::”将类与方法分隔开来。
    对象::实例方法名
    类::静态方法名
    类::实例方法名*/
    public static void test9(){
        Comparator<Integer> comparator = (x, y)->Integer.compare(x,y);
        Comparator<Integer> comparator1 = Integer::compare;
        int compare = comparator.compare(1,2);
        int compare1 = comparator1.compare(1,2);
        System.out.println("compare:"+compare);
        System.out.println("compare1:"+compare1);

        List<String> list = Arrays.asList("java","c#","javascript");
        //遍历
        for (String str:list){
            System.out.println("before java8,"+str);
        }
        list.forEach(x-> System.out.println("after java8,"+x));


        //map  把对象编程另一个
        List<Double> list2 = Arrays.asList(10.0,20.0,30.0);
        list2.stream().map(x->x+x*0.05).forEach(x-> System.out.println(x));


        //reduce  把对象合并
        List<Double> cost = Arrays.asList(10.0, 20.0,30.0);
        double sum = 0;
        for(double each:cost) {
            each += each * 0.05;
            sum += each;
        }
        System.out.println("before java8,"+sum);
        //after java8
        List<Double> list3 = Arrays.asList(10.0,20.0,30.0);
        double sum2 = list3.stream().map(x->x+x*0.05).reduce((sum1,x)->sum1+x).get();
        System.out.println("after java8,"+sum2);

        //filter
        List<Double> cost1 = Arrays.asList(10.0, 20.0,30.0,40.0);
        List<Double> filteredCost = cost1.stream().filter(x -> x > 25.0).collect(Collectors.toList());
        filteredCost.forEach(x -> System.out.println(x));
    }


}
