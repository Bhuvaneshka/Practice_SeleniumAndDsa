package Week4.Day2;

import org.junit.Test;

public class GetIndexSingleLinkedList {

	public class Node {
		int data;
		Node next;

		Node(int key) {
			this.data = key;
			next = null;
		}
	}

	public Node addValue(int data)
	{
		Node node = new Node(data);
		return node;
	}
	
	public int getIndex(Node node, int index) {
		int counter = 0;
		int indexValue = 0;
		while (node != null) {
			if (counter == index) {
				indexValue = node.data;
				break;
			}
			counter++;
			node = node.next;
		}
		return indexValue;
	}
	
	@Test
	public void example1()
	{
		Node node = addValue(10);
		node.next = addValue(20);
		node.next.next = addValue(30);
		node.next.next.next = addValue(40);
		int index = 2;
		
		System.out.println(getIndex(node, index));
	}
}
