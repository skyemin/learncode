package com.wei.learncode.geekAlgorithm.day14;

import com.wei.learncode.leetcode.ListNode;

import java.util.List;

public class MergeTwoLink {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode prev = head;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else{
                prev.next = l2;
                l2 = l2.next;
            }
        }
        prev.next = l1 == null ? l2 : l1;
        return head.next;
    }


    public class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) { val = x; }

    }
}
