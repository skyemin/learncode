package com.wei.learncode.geekAlgorithm.day3.time3;

import com.wei.learncode.geekAlgorithm.day3.time1.ListNode;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/28 17:16
 */
public class SwapPairs {

    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
        //第三个元素
        ListNode nextTwo = head.next.next;
        //首尾交换位置
        ListNode newHead = head.next;
        newHead.next = head;
        head.next = swapPairs(nextTwo);
        return newHead;
    }

}
