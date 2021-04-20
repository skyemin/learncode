package com.wei.learncode.newcoder;

import com.wei.learncode.geekAlgorithm.day3.time1.ListNode;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/19 18:53
 */
public class DetectCycle {

    public ListNode detectCycle(ListNode head) {

        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode quick = head.next;
        while (slow != quick){
            if(quick == null || quick.next == null){
                return null;
            }
            slow = slow.next;
            quick = quick.next.next;
        }
        return slow;
    }
}
