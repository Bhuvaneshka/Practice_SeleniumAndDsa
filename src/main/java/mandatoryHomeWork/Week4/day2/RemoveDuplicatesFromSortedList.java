package mandatoryHomeWork.week4.day2;

import org.junit.Test;

public class RemoveDuplicatesFromSortedList {

	public class Node {
		int data;
		Node next;
		Node prev;

		Node() {
			next = null;
		}

		Node(int key) {
			this.data = key;
			next = null;
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
		Node node = addValue(1);
		node.next = addValue(1);
		node.next.next = addValue(2);
		node.next.next.next = addValue(2);

		Node result = removeDuplicateValues(node);
		printAllNodes(result);
	}

	private Node removeDuplicateValues(Node node) {
		if (node == null || node.next == null)
			return node;
		Node prev = node;
		Node curr = node.next;

		while (curr != null) {
			if (prev.data == curr.data) {
				prev.next = curr.next;
			} else
				prev = curr;

			curr = curr.next;
		}
		return node;
	}
}
