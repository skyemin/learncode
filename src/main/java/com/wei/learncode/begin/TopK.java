package com.wei.learncode.begin;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author skye
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
 * @date 2021/4/9 15:34
 */
public class TopK {

    public int[] getLeastNumbers(int[] arr, int k) {

        if(k == 0){
            return new int[0];
        }
        //大顶堆
        Queue<Integer> heap = new PriorityQueue<>(k,(i1,i2) -> Integer.compare(i2,i1));
        for (int i : arr) {
            if(heap.isEmpty() || heap.size()<k || i < heap.peek()){
                heap.offer(i);
            }
            if(heap.size() > k){
                heap.poll();
            }
        }
        int[] res = new int[heap.size()];
        int j = 0;
        for (int re : heap) {
            res[j++] = re;
        }
        return res;
    }
}
