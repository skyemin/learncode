package com.wei.learncode.newcoder;

import java.util.HashMap;
import java.util.Map;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/19 14:42
 */
public class MoreThanHalfNum_Solution {

    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length == 1){
            return array[0];
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : array) {
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
                if(map.get(i)>array.length/2){
                    return i;
                }
            }else{
                map.put(i,1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        MoreThanHalfNum_Solution moreThanHalfNum_solution = new MoreThanHalfNum_Solution();
        System.out.println(moreThanHalfNum_solution.MoreThanHalfNum_Solution(new int[]{1, 2, 3, 2, 4, 2, 5, 2, 3}));
    }
}
