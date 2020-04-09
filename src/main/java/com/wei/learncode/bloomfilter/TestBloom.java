package com.wei.learncode.bloomfilter;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

/**
 * @Author: skye
 * @Date: 2019/11/21 9:54
 * @Description:
 * @Version:1.0
 */
public class TestBloom {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        //类型,预计存放数据量,误报率
        BloomFilter filter = BloomFilter.create(Funnels.integerFunnel(),1000000,0.01);
        for (int i = 0; i < 1000000; i++) {
            filter.put(i);
        }
        if(filter.approximateElementCount()>1000000){
            filter = BloomFilter.create(Funnels.integerFunnel(),1000000,0.01);
        };
        System.out.println(filter.approximateElementCount());
       /* System.out.println(filter.mightContain(1));
        System.out.println(filter.mightContain(2));
        System.out.println(filter.mightContain(222222222));*/
        long end = System.currentTimeMillis();
        System.out.println("花费时间:"+(end-start)+"毫秒");
    }
}
