package com.queryAndSort;

public class QuickSort {

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
