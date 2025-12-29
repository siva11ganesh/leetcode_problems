package com.blind75.sorting;

/**
 * Author: Sivaganesh S
 * Date:10/13/2025
 */

public class BinarySearch {

    static int binarySearch(int[] arr, int x, int left, int right) {

        while (left <= right) {
            int mid = (left + right) / 2;

            if (x == arr[mid]) {
                return mid;
            }
            if (x > arr[mid])
                left = mid + 1;

            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7, 8, 9};
        int n = array.length;
        int x = 4;
        int result = binarySearch(array, x, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}
