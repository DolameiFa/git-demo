package com.example.demo.leetcode.hot100.链表;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*给你一个链表的头节点 head ，判断链表中是否有环。
如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。*/
public class HasCycle {
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
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
        head.next.next.next.next = head.next;
        System.out.println(hasCycle(head));
    }

    private static boolean hasCycle(ListNode head){
        if(head==null||head.next==null){
            return false;
        }
        Set<ListNode> set = new HashSet<>();
        while(head!=null){
            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
