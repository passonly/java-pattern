package com.queryAndSort;

import java.util.Arrays;

public class MergeSort {

  /**
   * 归并排序的时间复杂度任何情况下都是 O(nlogn)
   * 临时内存空间最大也不会超过 n 个数据的大小，所以空间复杂度是 O(n)
   * @param args
   */
  public static void main(String[] args) {
    int []arr = {9,8,7,6,5,4,3,2,1};
    int[] result = new int[arr.length];
    sort(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
  }

  private static void sort(int[] arr, int left, int right) {
    if (left < right) {
      int middle = (left + right) / 2;
      sort(arr,left , middle);
      sort(arr,middle +1, right );
      merge(arr,left ,right ,middle);
    }
  }

  private static void merge(int[] arr, int left, int right, int middle) {
    int[] result = new int[arr.length];

    int i = left;
    int j = middle +1;
    int t = 0;
    while (i <= middle && j<=right) {
      if (arr[i] <= arr[j]) {
        result[t++] = arr[i++];
      } else {
        result[t++] = arr[j++];
      }
    }
    while (i <= middle) {
      result[t++] = arr[i++];
    }
    while (i <= middle) {
      result[t++] = arr[j++];
    }
    t=0;
    while (left <= right) {
      arr[left++] = result[t++];
    }
  }


}
