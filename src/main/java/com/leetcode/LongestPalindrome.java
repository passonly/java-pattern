package com.leetcode;

public class LongestPalindrome {
  public static void main(String[] args) {
    String ss = "aba";
    System.out.println(longestPalindrome(ss));
  }

  public static String longestPalindrome(String s) {
    if (s == null || s.length() < 1) {
      return "";
    }
    int start = 0, end = 0;
    for (int i = 0; i < s.length(); i++) {
      //奇数
      int len1 = expandAroundCenter(s, i, i);
      //偶数
      int len2 = expandAroundCenter(s, i, i + 1);
      int len = Math.max(len1, len2);
      if (len > end - start) {
        start = i - (len - 1) / 2;
        end = i + len / 2;
      }
    }
    return s.substring(start, end + 1);
  }

  /**
   * 从i开始，向两边查询回文子串
   * @param s
   * @param left
   * @param right
   * @return
   */
  public static int expandAroundCenter(String s, int left, int right) {
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
      --left;
      ++right;
    }
    return right - left - 1;
  }

}
