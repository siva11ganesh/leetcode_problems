package com.blind75.sorting;

/**
 * simplest sorting algorithm that works by repeatedly swapping the adjacent elements
 * if they are in the wrong order.
 */
public class BubbleSort {

    /**
     * Time Complexity: O(n2)
     * Space Complexity: O(1)
     * O(n2) which makes it very slow for large data sets
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
        int i, j, temp;
        boolean isSwapped;
        for (i = 0; i < len - 1; i++) {
            isSwapped = false;
            for (j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
            }
        }
    }
}
