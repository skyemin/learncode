package com.wei.learncode.newcoder;

import com.wei.learncode.geekAlgorithm.day3.time1.ListNode;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/23 10:32
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // 类似归并排序中的合并过程
        ListNode cur = new ListNode(0);
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        // 任一为空，直接连接另一条链表
        if (l1 == null) {
            cur.next = l2;
        } else {
            cur.next = l1;
        }
        return cur.next;
    }
}
