package com.leetcode.problems.node;

public class LinkedListTest {

	ListNode head;

	public void add(int data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			head = newNode;
		} else {
			ListNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.value + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public void reverseDisplay(ListNode rev) {
		ListNode current = rev;
		while (current != null) {
			System.out.print(current.value + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		LinkedListTest ll = new LinkedListTest();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.display();

		ListNode reverse = ll.reverseList();
		ll.reverseDisplay(reverse);
	}

	public ListNode reverseList() {
		ListNode curr = head;
		ListNode prev = null;
		ListNode next;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}
