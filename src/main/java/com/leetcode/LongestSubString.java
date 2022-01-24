package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {



  public static void main(String[] args) {
    String test = "sksja";
    int length = longestSubString(test);
    System.out.println(length);
  }

  private static int longestSubString(String test) {
    int length = test.length();
    int result = 0;
    for (int i = 0; i < length; i++) {
      int len = getDifLength(test.substring(i), i);
      if (len > result) {
        result = len;
      }
    }
    return result;
  }

  private static int getDifLength(String substring, int index) {
    int length = substring.length();
    Map<Character, Integer> map = new HashMap<>();
    int i = 0;
    while (i < length){
      char c = substring.charAt(i);
      if (map.containsKey(c)) {
        return map.size();
      }
      map.put(c,i);
      i++;
    }
    return map.size();
  }
}
