package com.example.demo.leetcode.hot100.链表;

import java.util.List;

/*将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。*/
public class MergeTwoLists {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(3,new ListNode(5)));
        ListNode l2 = new ListNode(2,new ListNode(4,new ListNode(6)));
        ListNode head = mergeTwoLists(l1,l2);
        System.out.println(head);
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        while(l1!=null&&l2!=null){
            if (l1.val<l2.val){
                head = head.next = l1;
                l1 = l1.next;
            }
            else{
                head = head.next = l2;
                l2 = l2.next;
            }
        }
        if(l1!=null){
            head.next = l1;
        }
        if(l2!=null){
            head.next = l2;
        }
        return dummy.next;
    }
}
