package com.blind75.sorting;

public class RecursiveBubbleSort {

    /**
     * Time Complexity: O(n*n)
     * Auxiliary Space: O(n)
     */
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        System.out.println("Before Sorted: ");
        printArray(arr, n);
        bubbleSort(arr, n);
        System.out.println("After Sorted: ");
        printArray(arr, n);
    }

    static void printArray(int[] arr, int len) {
        for (int i = 0; i < len; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void bubbleSort(int[] arr, int len) {

        //base case
        if (len == 1)
            return;

        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        }

        if (count == 0) {
            return;
        }

        bubbleSort(arr, len - 1);
    }
}
