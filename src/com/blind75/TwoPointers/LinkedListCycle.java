package com.blind75.TwoPointers;

/**
 * Two Pointers,LinkedList,HashTable
 */
public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2; // cycle here

        System.out.println("Cycle exists? " + hasCycle(n1)); // true

        // Example 2: List without cycle
        // 10 -> 20 -> 30 -> null
        ListNode m1 = new ListNode(10);
        ListNode m2 = new ListNode(20);
        ListNode m3 = new ListNode(30);

        m1.next = m2;
        m2.next = m3;

        System.out.println("Cycle exists? " + hasCycle(m1));
    }
}


