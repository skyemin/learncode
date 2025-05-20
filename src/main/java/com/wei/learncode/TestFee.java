package com.wei.learncode;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import lombok.Data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/3/17 15:40
 */
public class TestFee {

    @Data
    public static class Fee1{
        private String fee;
        private String cee;

    }

    public int calculate(int num){
        int price = 0;
        int[] degree = {0,5,20,50,100,500,1000,2000,3000,4000,5000,6000};
        int[] fee = {30,15,10,9,8,7,6,5,4,3,2,1};

        for (int i = 1; i < degree.length; i++) {
            if(num <= degree[i]){
                price += (num-degree[i-1])*fee[i-1];
                break;
            }else{
                price += ((degree[i]-degree[i-1])*fee[i-1]);
            }
        }
        return price;
    }
    public static void main(String[] args) {

        String a = "1";
        String b = a;
        a = "2";
        System.out.println();

      /*  Double a = 1.0;
        Double b = 1.0;
        System.out.println(a==b);
        BigDecimal rentPrice = BigDecimal.valueOf(1299);
        Integer waveValue = null;
        //rentPrice.multiply(BigDecimal.valueOf(waveValue)).divide(BigDecimal.valueOf(1E2), RoundingMode.HALF_UP);


        RangeMap<Integer, Integer> waveMap = TreeRangeMap.create();
        waveMap.put(Range.closed(0, 1), 2);
        System.out.println(waveMap.get(0));
        System.out.println(waveMap.get(1));
        System.out.println(waveMap.get(3));*/
       /* TestFee testFee = new TestFee();
        System.out.println(testFee.calculate(30));*/
       /* StringJoiner stringJoiner = new StringJoiner(" | ");
        stringJoiner.add("朝阳区");
        stringJoiner.add("酒仙桥自如寓");
        stringJoiner.add("距14号线将台地铁站2146米");
        System.out.println(stringJoiner.toString());*/
       /* String test = "123";
        System.out.println(test.contains(""));*/
       /* List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if(next == 2){
                iterator.remove();
            }
        }
        System.out.println(list.size());*/
//        Integer a = null;
//        System.out.println(a == 1);
//        Long time;
//        time = 1718888400L*1000+1000;
//        Date date = new Date(time);
//        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
//        System.out.println(format);
//        String test = "123";
//        Fee1 fee1 = null;
//        //fee1.setFee(test);
//        //fee1.setCee(test);
//        List<String> list = new ArrayList<>();
//        list.add("*");
//        System.out.println("*".equals(list));

       // System.out.println(JSON.toJSONString(fee1));
    }

    //    intervals = [[1,2],[2,3],[3,4],[1,3]]
    //    解题过程
    //    将所有区间按照结束时间升序排序。
    //    从第一个区间开始，依次检查后面的区间是否与当前区间重叠。
    //    如果不重叠，则更新当前区间，并增加非重叠区间的计数。
    //    最后返回总区间数减去非重叠区间的计数，即为需要移除的区间数量。
    public int eraseOverlapIntervals(int[][] intervals) {
        // 按照每个区间的结束时间进行排序
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        // 初始化第一个区间的索引 i 和非重叠区间的计数 count
        int i = 0;
        int count = 1;

        // 遍历所有区间
        for (int j = 1; j < intervals.length; j++) {
            // 如果当前区间的开始时间大于等于前一个区间的结束时间，则它们不重叠
            if (intervals[i][1] <= intervals[j][0]) {
                // 更新 i 为当前区间的索引，并增加非重叠区间的计数
                i = j;
                count++;
            }
        }

        // 返回需要移除的区间数量
        return intervals.length - count;
    }
}
