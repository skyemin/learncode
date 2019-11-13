package com.wei.learncode.leetcode;

/**
 * @Author: skye
 * @Date: 2019/11/13 11:33
 * @Description:  相交链表
 * @Version:1.0
 */
public class IntersectionNode {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

    public static void main(String[] args) {
        //2-3
        //1-6-6-3
        ListNode listNode = new ListNode(3);
        ListNode listNodex = new ListNode(6);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(1);
        listNode1.next = listNodex;
        listNode1.next.next = listNodex;
        listNode1.next.next.next = listNode;
        listNode2.next = listNode;
        getIntersectionNode(listNode1,listNode2);
    }
}
