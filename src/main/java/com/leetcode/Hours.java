package com.leetcode;

import java.util.HashMap;

public class Hours {
  public static void main(String[] args) {
    int [] arr = new int[] {9,9,6,0,6,6,9,9,9};
    String s = findHours(arr);
    System.out.println(s);
  }

  private static String findHours(int[] arr) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      sb.append(arr[i]);
    }
    String s = sb.toString();
    String[] split = s.split("0");
    HashMap<Integer, String> map = new HashMap<>();
    int maxNum = 0;
    for (int i = 0; i < split.length; i++) {
      String s1 = split[i];
      int length = s1.length();
      int tmpNum = 0;
      for (int j = 0; j < length; j++) {
        char c = s1.charAt(j);
        Integer num = Integer.valueOf(c);
        if (num > 8) {
          tmpNum++;
        }
      }
      map.put(tmpNum,s1);
      if (tmpNum > maxNum) {
        maxNum = tmpNum;
      }
    }

    return map.get(maxNum);
  }
}
