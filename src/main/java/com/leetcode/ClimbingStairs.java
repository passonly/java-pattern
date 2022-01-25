package com.leetcode;

public class ClimbingStairs {

  public static void main(String[] args) {

    System.out.println(climbStairs(4));
  }

//  public static int climbStairs(int n) {
//    if (n == 1) {
//      return 1;
//    }
//    if (n == 2) {
//      return 2;
//    }
//
//    return climbStairs(n - 1) + climbStairs(n - 2);
//  }

  //
//  public static int climbStairs(int n) {
//    if (n == 1) {
//      return 1;
//    }
//    int[] dp = new int[n + 1];
//    dp[1] = 1;
//    dp[2] = 2;
//    for (int i = 3; i <= n; i++) {
//      dp[i] = dp[i - 1] + dp[i - 2];
//    }
//    return dp[n];
//  }
//
  public static int climbStairs(int n) {
    double sqrt5 = Math.sqrt(5);
    double fibn = Math.pow((1 + sqrt5) / 2, n + 1) - Math.pow((1 - sqrt5) / 2, n + 1);
    return (int) Math.round(fibn / sqrt5);
  }


}
