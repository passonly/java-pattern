package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArray {
  public static void main(String[] args) {
    int[][] arr = new int[][]{{1,3},{2,6},{8,10},{15,18}};
    int[][] merge = merge(arr);
    System.out.println(merge);
  }

  public static  int[][] merge(int[][] intervals) {
    List<int[]> list = new ArrayList<>();
    Arrays.sort(intervals,(v1,v2) -> v1[0]-v2[0]);
    for (int i = 0; i < intervals.length; i++) {
      if(i==0) {
        list.add(intervals[i]);
      }
      int[] pre = list.get(list.size() - 1);
      int len = list.size();
      if (pre[0] == intervals[i][0] && pre[1] < intervals[i][1]) {
        list.set(len - 1, intervals[i]);
      }
      if (pre[0] < intervals[i][0] && pre[1] > intervals[i][0]) {
        list.set(len - 1, new int[]{pre[0],intervals[i][1]});
      }
      if ( pre[1] < intervals[i][0]) {
        list.add(intervals[i]);
      }
    }
    return list.toArray(new int[list.size()][]);
  }
}
