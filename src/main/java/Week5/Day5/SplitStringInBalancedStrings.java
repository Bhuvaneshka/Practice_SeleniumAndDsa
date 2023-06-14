
package Week5.Day5;

import java.util.Stack;

import org.junit.Test;

public class SplitStringInBalancedStrings {
	/*
	 * Leetcode 1221: 
	 * Balanced strings are those
	 * that have an equal quantity of 'L' and 'R' characters. Given a balanced
	 * string s, split it into some number of substrings such that: Each substring
	 * is balanced. Return the maximum number of balanced strings you can obtain.
	 * 
	 * pseudocode:
	 * 1) create a empty stack to store the values
	 * 2) Iterate from 0 to s.length
	 * 3) If the stack is empty push the s.charAt(i) into the stack
	 * 4) check if the second value is equal to top of the stack, if yes then push the next value 
	 * 5) else pop the value out then check if the stack is empty, if yes, increment the counter else continue
	 * 6) Finally return the counter value
	 * 
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */
	
	
	@Test
	public void example1() {
		String s= "RLRRLLRLRL";
		System.out.println(splitBalancedString(s));
//		output: 4
	}
	
	@Test
	public void example2() {
		String s= "RR";
		System.out.println(splitBalancedString(s));
//		output: 0
	}
	
	@Test
	public void example3() {
		String s= "LL";
		System.out.println(splitBalancedString(s));
//		output: 0
	}
	
	@Test
	public void example4() {
		String s= "LLRRRL";
		System.out.println(splitBalancedString(s));
//		output: 2
	}
	
	@Test
	public void example5() {
		String s= "RLRRRLLRLL";
		System.out.println(splitBalancedString(s));
//		output: 2
	}

	private int splitBalancedString(String s) {
		int i =0, counter=0;
		Stack<Character> st = new Stack();
		while(i<s.length())
		{
			char c = s.charAt(i);
			if(st.isEmpty())
			{
				st.push(c);
				i++;
				continue;
			}
			
			if(!st.isEmpty())
			{
				char stackTopValue = st.peek();
				if(stackTopValue!=c)
				{
					st.pop();
					if(st.isEmpty()) {counter++;}
				}else st.push(c);
			}
			i++;
		}
		return counter;
	}
}
