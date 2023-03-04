package com.wei.learncode;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

public class Test2 {

    public static void main(String[] args) {


        Region r1 = new Region();
        r1.setName("test111");
        r1.setFid("1");

        Region r2 = new Region();
        r2.setName("test");
        r2.setFid("1");

        Region r3 = new Region();
        r3.setName("test");
        r3.setFid("1");

        List<Region> list = new ArrayList<>();

        list.add(r1);
        list.add(r2);
        list.add(r3);

        ArrayList<Region> collect1 = list.stream().collect(
                collectingAndThen(
                        toCollection(() -> new TreeSet<>(Comparator.comparing(Region::getFid))), ArrayList::new)
        );

        Map<String, Region> collect = collect1.stream().distinct().collect(Collectors.toMap(region -> region.getFid(), Function.identity()));
        System.out.println(1);



    }
}
