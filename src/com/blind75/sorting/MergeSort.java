package com.blind75.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        int left = 0;
        int len = arr.length; //right point
        System.out.println("Before Sorted...");
        printArray(arr, len);
        mergeSort(arr, left, len - 1);
        System.out.println("After Sorted...");
        printArray(arr, len);

        //collections Sort
        int[] arr1 = {4, 1, 3, 9, 7};
        List<Integer> list = new ArrayList<>();
        for (int i : arr1) {
            list.add(i);
        }
        Collections.sort(list);
    }

    static void printArray(int[] arr, int len) {
        for (int i = 0; i < len; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
            // Sort first and second halves
            mergeSort(arr, l, m);
//            System.out.println("l:" + l + "..m:" + m + "..r:" + r);
            mergeSort(arr, m + 1, r);
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];
        // Copy data to temp arrays
        System.arraycopy(arr, l, L, 0, n1);
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays
        // Initial indices of first and second subarrays
        int i = 0, j = 0;
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
