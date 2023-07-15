package com.wei.learncode.geekAlgorithm.day0715;

import com.wei.learncode.leetcode.ListNode;

public class ReOrderList {

    public void reorderList(ListNode head) {

        ListNode mid = midListNode(head);
        ListNode l2 = mid.next;
        ListNode l1 = head;
        mid.next = null;
        l2 = reverList(l2);
        mergeList(l1,l2);
    }

    private void mergeList(ListNode l1, ListNode l2) {
        ListNode l1tmp;
        ListNode l2tmp;
        while(l1 != null && l2 != null){
            l1tmp = l1.next;
            l2tmp = l2.next;

            l1.next = l2;
            l1 = l1tmp;

            l2.next = l1;
            l2 = l2tmp;
        }
    }

    private ListNode reverList(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;
        while (curr != null) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }

    private ListNode midListNode(ListNode head) {

        ListNode slow = head;
        ListNode quick = head;
        while (quick.next != null && quick.next.next != null){
         slow = slow.next;
         quick = quick.next.next;
        }
        return slow;
    }
}
