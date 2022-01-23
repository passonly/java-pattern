package com.queryAndSort;

public class BinarySearch {
  public static void main(String[] args) {

    int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    int key = 3;
    int from = 0;
    int to = arr.length;
    int index = binarySearch(arr, from, to, key);
    System.out.println(index);

  }

  private static int binarySearch(int[] arr, int from, int to, int key) {

    int middle = (from >>> 1) + (to >>> 1);
    int tmp = arr[middle];
    if (from <= to) {
      if ( tmp < key) {
        to = middle;
      }
      if (tmp > key) {
        from = middle;
      }
      if (tmp == key) {
        return middle;
      }
    }

    return binarySearch(arr, from ,to, key);
  }


}
