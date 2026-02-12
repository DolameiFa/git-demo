package com.example.demo.leetcode.hot100;

public class PalindromeLinkedList {
    /**
     * 力扣题目：回文链表
     *
     * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。
     * 如果是，返回 true ；否则，返回 false 。
     *
     * 示例 1：
     * 输入：head = [1,2,2,1]
     * 输出：true
     *
     * 示例 2：
     * 输入：head = [1,2]
     * 输出：false
     */

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean isPalindrome(ListNode head) {
        return false;
    }

    public static void main(String[] args) {
    }
}
