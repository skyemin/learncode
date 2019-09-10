package com.wei.learncode.leetcode;

/**
 * @Author: weizz
 * @Date: 2019/9/10 16:25
 * @Description:
 * @Version:1.0
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
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
}
