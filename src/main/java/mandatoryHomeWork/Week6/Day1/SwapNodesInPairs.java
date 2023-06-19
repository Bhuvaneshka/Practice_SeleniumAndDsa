package mandatoryHomeWork.Week6.Day1;

import org.junit.Test;


public class SwapNodesInPairs {
	/*
	 * LeetCode 24: Given a linked list, swap every two adjacent nodes and return
	 * its head. You must solve the problem without modifying the values in the
	 * list's nodes (i.e., only nodes themselves may be changed.)
	 * 
	 * Pseudocode: 
	 * 1) Create one dummy node before head and create one pointer on it
	 * 2) Iterate only if dummy.next & dummy.next.next != null the allow inside loop else return head
	 * 3) Inside loop, point the position of swap1 and swap2 using swap1 = point.next & swap2 = point.next.next
	 * 4) now perform the swap operation
	 * 5) after the swap, make the point to swap1 
	 * 6) Repeat the steps until the tail
	 * 
	 * 
	 * Time Complexity:O(n) Space Complexity:O(1)
	 */
	@Test
	public void example1() {
		Node node = new Node(1);
		node.next = addValue(2);
		node.next.next = addValue(3);
		node.next.next.next = addValue(4);
		Node finalHead = swapPairs(node);
		printAllNodes(finalHead);
//		output: [2,1,4,3]
	}
	
	@Test
	public void example2() {
		Node node = new Node(1);
		node.next = addValue(2);
		node.next.next = addValue(3);
		Node finalHead = swapPairs(node);
		printAllNodes(finalHead);
//		output: [2,1,3]
	}
	
	@Test
	public void example3() {
		Node node = new Node(1);
		Node finalHead = swapPairs(node);
		printAllNodes(finalHead);
//		output: [1]
	}
	
	@Test
	public void example4() {
		Node node = new Node();
		Node finalHead = swapPairs(node);
		printAllNodes(finalHead);
//		output: []
	}
	
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

	private Node swapPairs(Node head) {
		//Create dummy node and add before head
		 Node dummy = new Node();
		    dummy.next = head;
		    
		    //point the node in dummy
		    Node point = dummy;
		    
		    while (point.next != null && point.next.next != null)
		    {
		    	//Find the node to swap
		    	Node swap1 = point.next;
		    	Node swap2 = point.next.next;
		    	
		    	//swap the nodes
		    	swap1.next = swap2.next;
		    	swap2.next = swap1;
		    	
		    	//move the point after swap
		    	point.next = swap2;
		    	point = swap1;
		    }
		    //return the start node
		    return dummy.next;
	}

}
