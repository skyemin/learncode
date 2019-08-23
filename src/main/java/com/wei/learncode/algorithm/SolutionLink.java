package com.wei.learncode.algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: weizz
 * @Date: 2019/8/23 14:26
 * @Description:
 * @Version:1.0
 */


public class SolutionLink {
    static ArrayList<Integer> copyList = new ArrayList<>();
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            this.val = x;
        }
    }
    public static void mergeKLists(ListNode[] lists) {
        for (ListNode node : lists) {
            test(node);
        }
        Integer[] array = copyList.toArray(new Integer[0]);
        Arrays.sort(array);
        for (Integer integer : array) {
            System.out.println(integer);
        }
    }

    public static void test(ListNode node){
        if(node != null){
            copyList.add(node.val);
            test(node.next);
        }
    }

    public static void main(String[] args) {
       /* 1->4->5,
                1->3->4,
                2->6*/
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(5);
        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(4);
        ListNode node3 = new ListNode(2);
        node3.next = new ListNode(6);
        ListNode[] listNodes = {node1,node2,node3};
        mergeKLists(listNodes);
    }
}