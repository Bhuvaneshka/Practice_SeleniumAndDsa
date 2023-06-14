package Week4.Day3;

import java.util.Currency;
import java.util.LinkedList;

import org.junit.Test;


public class RemoveLikedListElements {
//	https://leetcode.com/problems/remove-linked-list-elements/

	class Node {
		int val;
		Node next;

		Node() {
		}

		Node(int val) {
			this.val = val;
		}

		Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}

	public Node addValue(int data) {
		Node node = new Node(data);
		return node;
	}

	private void printAllNodes(Node node) {
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

	@Test
	public void example1() {
		int val = 2;
		Node head = new Node(1);
		head.next = addValue(1);
		head.next.next = addValue(2);
		head.next.next.next = addValue(3);
		head.next.next.next.next = addValue(4);
		head.next.next.next.next.next = addValue(4);
		removeElement(head, val);
		Node nd = removeElement(head, val);
		printAllNodes(nd);
//		printAllNodes(removeElement(head, val));
	}
	
	@Test
	public void example2() {
		int val = 7;
		Node head = new Node(7);
		head.next = addValue(7);
		head.next.next = addValue(7);
		head.next.next.next = addValue(7);
		printAllNodes(removeElement(head, val));
	}

	private Node removeElement(Node head, int val) {
		Node temp = new Node(-1);
		Node current = head;
		while(current.next != null)
		{
			if(current.next.val == val)
			{
				current.next = current.next.next;
			}else
			{
				current = current.next;
			}
		}
		return temp.next;		
	}

}
