package com.wei.learncode.leetcode;


//https://leetcode.cn/problems/remove-nth-node-from-end-of-list/?favorite=2cktkvj
//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode l1 = dummy;
        ListNode l2 = dummy;
        while(n > 0){
            l1 = l1.next;
            n--;
        }
        while (l1.next != null){
            l1 = l1.next;
            l2 = l2.next;
        }
        l2.next = l2.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
    }
}
