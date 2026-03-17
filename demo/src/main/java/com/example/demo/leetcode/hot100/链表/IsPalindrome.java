package com.example.demo.leetcode.hot100.链表;

import java.util.List;

/*给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。*/
public class IsPalindrome {
    public static class ListNode{
        public int val;
        public ListNode next;
        public ListNode(int x){
            this.val = x;
        }
        public ListNode(int x,ListNode next){
            this.val = x;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(2,
                                        new ListNode(1)))));
        System.out.println(isPalindrome(head));

    }
    private static boolean isPalindrome(ListNode head){
        ListNode headB = getMid(head);
        ListNode headC = reverseLinkedList(headB.next);
        while(headC!=null){
            if(head.val!=headC.val){
                return false;
            }
            head = head.next;
            headC = headC.next;
        }
        return true;
    }

    private static ListNode getMid(ListNode head){
        if(head == null||head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
       return slow;
    }

    private static ListNode reverseLinkedList(ListNode head){
        if(head == null||head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
