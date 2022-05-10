package com.wei.learncode;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HotRegionVo implements Comparable<HotRegionVo> {

    private String regionCode;
    private String regionName;
    private Double distance;

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
    @Override
    public int compareTo(@NotNull HotRegionVo o) {
        int a = this.getRegionCode().compareTo(o.getRegionCode());
        if( a == 0 ){
            return a;
        }else{
            return this.getDistance().compareTo(o.getDistance());
        }
    }
    public static void main(String[] args) {
        HotRegionVo vo1 = new HotRegionVo();
        vo1.setRegionCode("test1");
        vo1.setDistance(1.0);
        HotRegionVo vo2 = new HotRegionVo();
        vo2.setDistance(3.0);
        vo2.setRegionCode("test2");
        HotRegionVo vo3 = new HotRegionVo();
        vo3.setDistance(2.0);
        vo3.setRegionCode("test2");
        Set<HotRegionVo> set = new TreeSet<>();
        set.add(vo1);
        set.add(vo2);
        set.add(vo3);
        for (HotRegionVo hotRegionVo : set) {
            System.out.println(hotRegionVo.getRegionCode());
        }
    }
}
