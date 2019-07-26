package com.wei.learncode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by skye on 2019/1/21
 * 备忘录算法
 */
public class FibTest2 {

    //上面那个算法有很多重复计算的地方,可以用map去做一个缓存
    //时间复杂度:O(N)
    public static int fib(int num, Map<Integer,Integer> map){
        if(num < 1){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        if(num == 2){
            return 2;
        }
        if(num == 3){
            return 4;
        }
        if(map.containsKey(num)){
            return map.get(num);
        }else{
            int value = fib(num-3,map)+fib(num-2,map)+fib(num-1,map);
            map.put(num,value);
            return value;
        }
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Map<Integer,Integer> map = new HashMap<>();
        int fib = fib(200,map);
        System.out.println(fib);
        long endTime = System.currentTimeMillis();
        System.out.println("消耗时间:"+(endTime-startTime));
    }
}
