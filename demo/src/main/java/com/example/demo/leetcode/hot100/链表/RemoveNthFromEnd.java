package com.example.demo.leetcode.hot100.链表;
/*给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。*/
public class RemoveNthFromEnd {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
        ListNode(int x, ListNode next) {
            val = x;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode ans = removeNthFromEnd(head,2);
        while(ans!=null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head,int n){
        ListNode slow = new ListNode(0,head);
        ListNode ans = slow;
        ListNode fast = slow;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return ans.next;

    }
}
