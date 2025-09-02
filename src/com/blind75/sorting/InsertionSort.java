package com.blind75.sorting;

//We start with the second element of the array as the first element is assumed to be sorted.
//Compare the second element with the first element if the second element is smaller ,then swap them.
//Move to the third element, compare it with the first two elements, and put it in its correct position
//Repeat until the entire array is sorted.
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        int len = arr.length;
        System.out.println("Before Sorted:");
        printArray(arr, len);
        insertionSort(arr, len);
        System.out.println("After Sorted:");
        printArray(arr, len);
    }

    static void printArray(int[] arr, int len) {
        for (int i = 0; i < len; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void insertionSort(int[] arr, int len) {
        for (int i = 1; i < len; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
