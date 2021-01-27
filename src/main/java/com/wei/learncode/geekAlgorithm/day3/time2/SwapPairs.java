package com.wei.learncode.geekAlgorithm.day3.time2;

import com.wei.learncode.geekAlgorithm.day3.time1.ListNode;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/27 10:13
 */
public class SwapPairs {

    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
