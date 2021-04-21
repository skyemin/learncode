package com.wei.learncode.newcoder;

import com.wei.learncode.geekAlgorithm.day3.time1.ListNode;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/21 18:57
 */
public class FindKthToTail {

    public ListNode FindKthToTail (ListNode pHead, int k) {
        if(pHead == null)
            return null;
        ListNode fast = pHead;
        ListNode slow = pHead;
        for (int i = 0; i < k; i++) {
            if(fast == null){
                return null;
            }
            fast = fast.next;
        }
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
