package com.easyproblems;

import com.leetcode.problems.node.ListNode;

import java.util.Arrays;

public class MergeSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.value <= list2.value) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        // Attach the remaining nodes
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }


    public static void main(String[] args) {
        int[] list1 = {1, 2, 3};
        int[] list2 = {1, 3, 4};

        int[] list3 = Arrays.stream(list1).flatMap(value -> Arrays.stream(list2)).toArray();

        Arrays.stream(list3).forEach(System.out::println);
    }
}
