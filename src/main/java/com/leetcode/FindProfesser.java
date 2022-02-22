package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class FindProfesser {

  public static void main(String[] args) {
    int[][] arr = {{1,3},{2,3},{1,2}};
    int n = 3;
    int result = findProfessor(n, arr);
    System.out.println(result);
  }
  private static int findProfessor(int n , int[][] arr) {
    HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      int[] belief = arr[i];
      //村民
      int villager = belief[0];
      //被相信的人
      int beTrust = belief[1];
      HashSet<Integer> sets = map.computeIfAbsent(beTrust, re ->new HashSet<Integer>());
      sets.add(villager);
    }
    if (map.size() == n) {
      return -1;
    }
    for (int i = 1; i <= n; i++) {
      HashSet<Integer> persons = map.get(i);
      if (persons != null && persons.size() == n-1) {
        return i;
      }
    }
    return -1;
  }
}
