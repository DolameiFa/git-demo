package com.example.demo.leetcode.hot100.链表;
/*给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。*/
public class ReverseLinkedList {
    public static class ListNode{
        public int val;
        public ListNode next;

        ListNode(int x){
            this.val = x;
        }

        ListNode(int x,ListNode next){
            this.val = x;
            this.next = next;
        }

    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2, new ListNode(3, new ListNode(4))));
        System.out.println("原始链表:");
        new ReverseLinkedList().printList(head);
        System.out.println();
        ListNode result = new ReverseLinkedList().reverseLinkedList(head);

        while(result!=null){
            System.out.print(result.val+"");
            result = result.next;
        }
    }
    private ListNode reverseLinkedList(ListNode head){
        if (head == null || head.next == null) return head;
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
    private void printList(ListNode node) {
        ListNode curr = node; // 【规范】使用临时变量，严禁修改入参引用
        StringBuilder sb = new StringBuilder();
        while (curr != null) {
            sb.append(curr.val);
            if (curr.next != null) {
                sb.append(" -> ");
            }
            curr = curr.next;
        }
        System.out.println(sb.toString());
    }
}
