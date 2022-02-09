package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumAdd {

  public static void main(String[] args) {
      int []arr = new int[]{2,7,5,8};
    int[] ints = twoSum(arr, 9);
    System.out.println(Arrays.toString(ints));
  }

  private static int[] twoSum(int[] arr, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      int key = target - arr[i];
      if (map.containsKey(key)){
        Integer first = map.get(key);
        return new int[]{first,i};
      }
      map.put(arr[i],i);
    }
    return new int[0];
  }

}
