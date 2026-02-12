package com.example.demo.leetcode.hot100;

public class ReverseInteger {
    /**
     * 力扣题目 7：整数反转
     *
     * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
     * 如果反转后整数超过 32 位有符号整数的范围 [-2^31, 2^31 - 1] ，就返回 0。
     *
     * 示例 1：
     * 输入：x = 123
     * 输出：321
     *
     * 示例 2：
     * 输入：x = -123
     * 输出：-321
     *
     * 示例 3：
     * 输入：x = 120
     * 输出：21
     */

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            // 检查正向溢出：rev > Integer.MAX_VALUE / 10 或等于且 pop > 7
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            // 检查负向溢出：rev < Integer.MIN_VALUE / 10 或等于且 pop < -8
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        ReverseInteger solution = new ReverseInteger();
        int x1 = 123;
        int x2 = -123;
        int x3 = 120;
        int x4 = 1534236469; // 会溢出，期望返回 0

        System.out.println(solution.reverse(x1));
        System.out.println(solution.reverse(x2));
        System.out.println(solution.reverse(x3));
        System.out.println(solution.reverse(x4));
    }
}
