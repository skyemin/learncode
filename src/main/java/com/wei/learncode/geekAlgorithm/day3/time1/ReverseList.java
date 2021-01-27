package com.wei.learncode.geekAlgorithm.day3.time1;

/**
 * @author skye
 * @version 1.0
 * @description:  https://leetcode-cn.com/problems/reverse-linked-list/solution/fan-zhuan-lian-biao-by-leetcode-solution-d1k2/
 * @date 2021/1/25 14:41
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        //遍历链表时,将当前链表的next指针指向前一个节点,需要先用tmp临时存储,
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
