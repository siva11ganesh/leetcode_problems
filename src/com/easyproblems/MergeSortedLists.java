package com.easyproblems;

import com.leetcode.problems.node.ListNode;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
        int[] list4 = {4, 5, 6};

        int[] merged = IntStream.concat(
                        IntStream.concat(IntStream.of(list1), IntStream.of(list2)),
                        IntStream.of(list4))
                .sorted()
                .toArray();

        Arrays.stream(merged).forEach(System.out::println);


        int[] merged1 = Stream.of(list1, list2, list4)
                .flatMapToInt(IntStream::of)
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(merged1));
    }
}
