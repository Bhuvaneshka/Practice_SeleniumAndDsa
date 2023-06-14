package Week5.Day1;

import org.junit.Test;

public class MiddleOfTheLinkedList {

//	Given the head of a singly linked list, return the middle node of the linked list.
//	If there are two middle nodes, return the second middle node.
//	
//	Input: head = [1,2,3,4,5]
//			Output: [3,4,5]
	
	
	class Node {
		int val;
		Node next;

		Node() {
			next=null;
		}
		
		Node(int key) {
			this.val = key;
		}
	}

	public Node addValue(int data)
	{
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
	public void example() {
//		Node node = new Node(1);
//		node.next = addValue(2);
//		node.next.next = addValue(3);
//		node.next.next.next = addValue(4);
//		node.next.next.next.next = addValue(5);
//		
//		printAllNodes(node);
//		
//		printSecondPartOfLL(node);
		
		MiddleOfTheLinkedList ll = new MiddleOfTheLinkedList();
		
		int size = 0;
		for (int each : new int[] {1,2,3,4,5}) {
			ll.addValue(each);
			size++;
			System.out.println(each);
		}
 		printSecondPartOfLL(ll,size);
	}

	private void printSecondPartOfLL(MiddleOfTheLinkedList ll, int size) {
		int right = size/2;
		if(size%2==1)
			right++;
		
		while(right>=0) {
			System.out.println(ll);
		}
	}

	

}
