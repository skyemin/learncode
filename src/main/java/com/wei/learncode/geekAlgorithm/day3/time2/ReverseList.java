package com.wei.learncode.geekAlgorithm.day3.time2;

import com.wei.learncode.geekAlgorithm.day3.time1.ListNode;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/26 18:57
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }
}
