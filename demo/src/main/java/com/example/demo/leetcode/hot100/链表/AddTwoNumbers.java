package com.example.demo.leetcode.hot100.链表;


/*给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
请你将两个数相加，并以相同形式返回一个表示和的链表。
你可以假设除了数字 0 之外，这两个数都不会以 0 开头。*/
public class AddTwoNumbers {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
        ListNode head = addTwoNubmers(l1,l2);
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
    public static ListNode addTwoNubmers(ListNode l1,ListNode l2){
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        int carry = 0;
        while(l1!=null||l2!=null||carry!=0){
            int sum = carry;
            if (l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if (l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }
            head = head.next = new ListNode(sum%10);
            carry = sum/10;
        }
        return dummy.next;
    }
}
