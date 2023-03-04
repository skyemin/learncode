package com.wei.learncode.a1;

import com.wei.learncode.leetcode.ListNode;

public class Solution {
    //输入：l1 = [2,4,3], l2 = [5,6,4]
    //输出：[7,0,8]
    //解释：342 + 465 = 807.
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        //记录进位
        int carry = 0;
        while (l1 != null || l2 != null){
            int x = l1 != null?l1.val:0;
            int y = l2 != null?l2.val:0;
            int sum = x+y+carry;
            carry = sum/10;
            sum = sum%10;
            cur.next = new ListNode(sum);
            cur = cur.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(carry == 1){
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }
}