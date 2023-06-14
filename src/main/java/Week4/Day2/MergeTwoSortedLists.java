package Week4.Day2;

import org.junit.Test;

public class MergeTwoSortedLists {
//	You are given the heads of two sorted linked lists list1 and list2.
//	Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
//	Return the head of the merged linked list.

	// Points to Check:
	// 1) Did you understand the problem? - Yes
	// 2) Test data Set - Yes
	// 3) Do I know how to solve it? - Yes
	// 4) Ask for Hint? - No
	// 5) Do I know alternate solution as well? - No
	// 6) Find out the Big O Notation? - No
	// 7) Start always with pseudo code - Yes
	// 8) Implement the code in Editor, - Yes
	// 9) Test different set of data - Yes
	// 10) If it fails, debug them to solve it!! - Yes

//	pseudo Code:

	public class Node {
		int data;
		Node next;

		Node() {
			next = null;
		}

		Node(int key) {
			this.data = key;
			next = null;
		}
	}

	private Node addNode(int data) {
		Node node = new Node(data);
		return node;
	}

	private void printAllNodes(Node node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	@Test
	public void example1() {
		Node head1 = addNode(1);
		head1.next = addNode(2);
		head1.next.next = addNode(4);

		Node head2 = addNode(1);
		head2.next = addNode(3);
		head2.next.next = addNode(4);

		Node Merged = mergeLinkedList(head1, head2);
		printAllNodes(Merged);
	}

	@Test
	public void example2() {
		Node head1 = null;
		Node head2 = null;
		Node Merged = mergeLinkedList(head1, head2);
		printAllNodes(Merged);
	}

	@Test
	public void example3() {
		Node head1 = null;
		Node head2 = addNode(0);
		Node Merged = mergeLinkedList(head1, head2);
		printAllNodes(Merged);
	}

	private Node mergeLinkedList(Node node1, Node node2) {
		Node merged = new Node();
		Node curr = merged;
		while (node1 != null && node2 != null) {
			if (node1.data < node2.data) {
				curr.next = node1;
				node1 = node1.next;
			} else {
				curr.next = node2;
				node2 = node2.next;
			}
			curr = curr.next;
		}
		
		if(node1 == null) curr.next=node2;
		else curr.next=node1;
		
		return merged.next;
	}
}
