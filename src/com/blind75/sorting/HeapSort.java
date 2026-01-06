package com.blind75.sorting;

/**
 * Author: Sivaganesh S
 * Date:10/13/2025
 */

public class HeapSort {

    static void sort(int[] arr) {
        int n = arr.length/ 2 - 1;

        // Build max heap
        for (int i = n ; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Heap sort
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify root element
            heapify(arr, i, 0);
        }
    }

    static void heapify(int[] arr, int n, int i) {
        // Find largest among root, left child and right child
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        // Swap and continue heapifying if root is not largest
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 12, 9, 5, 6, 10};

        sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}
