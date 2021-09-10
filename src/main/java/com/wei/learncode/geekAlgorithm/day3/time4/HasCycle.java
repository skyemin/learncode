package com.wei.learncode.geekAlgorithm.day3.time4;

import com.wei.learncode.geekAlgorithm.day3.time1.ListNode;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/9/7 16:37
 */
public class HasCycle {

    public boolean hasCycle(ListNode head) {

        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode quick = head.next;
        while(slow != quick){
            if(quick == null || quick.next == null){
                return false;
            }
            slow = slow.next;
            quick = quick.next.next;
        }
        return true;
    }
}
