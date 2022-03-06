package com.queryAndSort;

public class QuickSort {

  /**
   * 其时间复杂度在平均情况下是nlogn，在最坏的情况下（有序时）时间复杂度是o(n^2)
   * 因此平均/最好空间复杂度为O(logn)，最坏空间复杂度为O(n)
   * @param args
   */

  public static void main(String[] args) {

    int[] array = {2, 8, 5, 6, 10, 5, 4, 6, 11, 15, 3};

    quickSort(array, 0, array.length - 1);

    for (int i = 0; i < array.length; i++) {
      System.out.printf(array[i] + ",");
    }

  }
  public static void quickSort(int[] arr,int left,int right){
    int middle;
    if(left < right){
      middle = partition(arr,left,right);
      quickSort(arr,left,middle-1);
      quickSort(arr,middle+1,right);
    }
  }

  public static int partition(int[] arr,int left,int right){
    int pivot = arr[left];
    while(left < right){
      while(left<right && arr[right] >= pivot)
        right--;
      arr[left] = arr[right];
      while(left < right && arr[left]<= pivot)
        left++;
      arr[right] = arr[left];
    }
    arr[left] = pivot;
    return left;
  }
}
