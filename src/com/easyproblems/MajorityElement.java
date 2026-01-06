package com.easyproblems;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,1,2};
        System.out.println(checkDuplicates(nums));
    }

    static int checkDuplicates(int[] arr) {
        int temp = arr[0];
        int count = 0;
        for (int num : arr) {
            if (count == 0) temp = num;
            count += (temp == num) ? 1 : -1;
        }
        return temp;
    }
}
