package com.wei.learncode.inteview;


public class Test {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = new ListNode(-1, head);
        ListNode cur = pre;
        while(cur.next != null && cur.next.next != null){
            if(cur.next.val == cur.next.next.val){
                int x =cur.next.val;
                while(cur.next != null && cur.next.val == x){
                    cur.next = cur.next.next;
                }
            }else{
                cur = cur.next;
            }
        }
        return pre.next;
    }


    public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
