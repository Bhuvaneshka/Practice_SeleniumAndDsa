package mandatoryHomeWork.week4.day5;

import java.util.LinkedList;

import org.junit.Test;

public class PalindromeLinkedList {

	/*
	 * https://leetcode.com/problems/palindrome-linked-list/description/
	 * 
	 * Given the head of a singly linked list, return true if it is a palindrome or
	 * false otherwise.
	 * 
	 * Time Complexity: Space Complexity:
	 */

	class Node {
		int data;
		Node next;
		Node prev;

		Node() {
			next = null;
		}

		Node(int key) {
			this.data = key;
		}
	}

	public Node addValue(int data) {
		Node node = new Node(data);
		return node;
	}

	public void printAllNodes(Node node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	@Test
	public void example1() {
		Node node = new Node(1);
		node.next = addValue(2);
		node.next.next = addValue(2);
		node.next.next.next = addValue(1);
		System.out.println(findPalindrome(node));
	}
	
	@Test
	public void example2() {
		Node node = new Node(1);
		node.next = addValue(2);
		node.next.next = addValue(1);
		node.next.next.next = addValue(1);
		System.out.println(findPalindrome(node));
	}
	
	@Test
	public void example3() {
		Node node = new Node(1);
		node.next = addValue(2);
		System.out.println(findPalindrome(node));
	}

	private boolean findPalindrome(Node head) {
		// Find the middle
		Node fast = head, slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		if (fast != null) {
			slow = slow.next;
		}

		// Reverse the second half
		slow = reverseList(slow);
		fast = head;

		while (slow != null) {
			if (fast.data != slow.data) {
				return false;
			}

			fast = fast.next;
			slow = slow.next;
		}
		return true;

	}

	private Node reverseList(Node head) {
		Node prev = null;
		while (head != null) {
			Node temp = head.next;
			head.next = prev;
			prev = head;
			head = temp;
		}
		return prev;
	}
}
