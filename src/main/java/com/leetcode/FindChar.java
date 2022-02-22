package com.leetcode;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class FindChar {
  public static void main(String[] args) {
    String [] arr = {"bella","label","roller"};
    Character [] result = findChar(arr);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }

  private static Character[] findChar(String[] arr) {

    Map<Character, Integer> map = new ConcurrentHashMap<>();
    //遍历第一个字符串
    String str = arr[0];
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      Integer presentCount = map.get(c);
      if ( presentCount == null ) {
        map.put(c,1);
      } else {
        presentCount++;
        map.put(c,presentCount);
      }
    }

    //遍历剩下字符串
    for (int i = 1; i < arr.length; i++) {
      String s = arr[i];
      int length = s.length();
      //循环字符串，
      HashMap<Character, Integer> tmpMap = new HashMap<>();
      for (int j = 0; j < length; j++) {
        char c = s.charAt(j);
        Integer presentCount = tmpMap.get(c);
        if ( presentCount == null ) {
          tmpMap.put(c,1);
        } else {
          presentCount++;
          tmpMap.put(c,presentCount);
        }
      }

      //循环map，如果没有，则移除原map， 如果数据小，则取小的
      Set<Character> characters = map.keySet();
      for (Character character : characters) {
        int pre = map.get(character);
        int tmp = tmpMap.get(character) == null ? 0 : tmpMap.get(character);
        if (!tmpMap.containsKey(character) || tmp == 0 ) {
          map.remove(character);
        }
        if ( tmp < pre) {
          map.put(character, tmp);
        }
      }
    }
    ArrayList<Character> list = new ArrayList<>();
    Set<Character> characters = map.keySet();
    for (Character character : characters) {
      Integer charCount = map.get(character);
      if (charCount != 0) {
        for (int i = 0; i < charCount; i++) {
          list.add(character);
        }
      }
    }
    return list.toArray(new Character[list.size()]);
  }
}
