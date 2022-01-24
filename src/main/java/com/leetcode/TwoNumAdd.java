package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumAdd {

    public static int[] twoSum(int[] nums, int target) {

      Map<Integer, Integer> map = new HashMap<>();
      for( int i = 0 ; i < nums.length ; i++) {
        Integer key = target - nums[i];
        if(map.containsKey(key)){
          int first = map.get(key);
          return new int[]{first, i};
        }
        map.put(nums[i], i);
      }
      return new int[0];
    }

  public static void main(String[] args) {
      int []arr = new int[]{2,7,5,8};
    int[] ints = twoSum(arr, 9);
    System.out.println(Arrays.toString(ints));
  }

}
