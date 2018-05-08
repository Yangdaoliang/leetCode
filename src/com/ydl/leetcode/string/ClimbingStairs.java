package com.ydl.leetcode.string;

public class ClimbingStairs {
    /**
     * 动态规划解决题目
     * n<=1，此时只有一种。
     * n>1时，对于每一个台阶i，要到达台阶，最后一步都有两种方法，从i-1迈一步，或从i-2迈两步。
     * 也就是说到达台阶i的方法数=达台阶i-1的方法数+达台阶i-2的方法数
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n <= 1) return 1;
        int[] dp = new int[n];
        dp[0] = 1; dp[1] = 2;
        for (int i = 2; i < n; ++i) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }

}
