package com.example.demo.leetcode.hot100.链表;


/*给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null */
public class GetIntersectionNode {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val = x;
            next = null;
        }
        ListNode(int x,ListNode next){
            this.val = x;
            this.next = next;
        }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA!=tempB){
            tempA = tempA!=null?tempA.next:headB;
            tempB = tempB!=null?tempB.next:headA;
        }
        return tempA;
    }
    public static void main(String[] args) {

        // --- 构造测试用例 ---
        // 创建公共部分: 8 -> 4 -> 5
        ListNode commonNode3 = new ListNode(5);
        ListNode commonNode2 = new ListNode(4, commonNode3);
        ListNode commonNode1 = new ListNode(8, commonNode2);


        // 创建链表 A: 4 -> 1 -> [8 -> 4 -> 5]
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1, commonNode1);

        // 创建链表 B: 5 -> 6 -> 1 -> [8 -> 4 -> 5]
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1, commonNode1);

        System.out.println("链表 A: 4 -> 1 -> 8 -> 4 -> 5");
        System.out.println("链表 B: 5 -> 6 -> 1 -> 8 -> 4 -> 5");
        System.out.println("预期相交节点值: 8");

        // 执行算法
        ListNode result = getIntersectionNode(headA, headB);

        // 输出结果
        if (result != null) {
            System.out.println("实际相交节点值: " + result.val);
            System.out.println("测试通过！");
        } else {
            System.out.println("未找到相交节点");
        }

        // --- 测试不相交的情况 ---
        System.out.println("\n--- 测试不相交情况 ---");
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        ListNode list2 = new ListNode(3);
        list2.next = new ListNode(4);

        ListNode result2 = getIntersectionNode(list1, list2);
        System.out.println("不相交测试结果: " + (result2 == null ? "null (正确)" : "错误"));

    }
}
