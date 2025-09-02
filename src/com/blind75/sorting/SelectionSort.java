package com.blind75.sorting;

public class SelectionSort {

    /**
     * Time Complexity: O(n2) - two loops is the reason
     * Space Complexity: O(1) - extra memory to use temp variables
     * This one is slow compared to Quick & Merge Sort
     */
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Before Sorting..");
        printArray(arr);
        searchSort(arr);
        System.out.println("After Sorting...");
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(" Arr: " + i);
        }
    }

    static void searchSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }

    }
}
