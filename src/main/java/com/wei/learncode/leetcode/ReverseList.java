package com.wei.learncode.leetcode;

/**
 * @Author: weizz
 * @Date: 2019/9/10 16:25
 * @Description:反转链表
 * @Version:1.0
 */
public class ReverseList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;

            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(3);
        node.next.next = new ListNode(5);
        reverseList(node);
    }
}
