package com.wei.learncode.geekAlgorithm.day3.time1;

/**
 * @author skye
 * @version 1.0
 * @description:  https://leetcode-cn.com/problems/swap-nodes-in-pairs/solution/hua-jie-suan-fa-24-liang-liang-jiao-huan-lian-biao/
 * @date 2021/1/25 15:09
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
