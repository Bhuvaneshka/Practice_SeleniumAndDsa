package Week4.Day3;

import java.util.Iterator;
import java.util.Stack;

import org.junit.Test;

public class RemoveAllAdjacentDuplicatesInString {

	/*
	 * You are given a string s consisting of lowercase English letters. A duplicate
	 * removal consists of choosing two adjacent and equal letters and removing
	 * them.
	 * We repeatedly make duplicate removals on s until we no longer can.
	 * Return the final string after all such duplicate removals have been made. 
	 * It can be proven that the answer is unique.
	 * 
	 */

	@Test
	public void example1()
	{
		String str = "abbaca";
		System.out.println(removeAllAdjacentDuplicates(str));
	}
	
	@Test
	public void example2()
	{
		String str = "azxxzy";
		System.out.println(removeAllAdjacentDuplicates(str));
	}

	@Test
	public void example3()
	{
		String str = "a";
		System.out.println(removeAllAdjacentDuplicates(str));
	}
	
	private String removeAllAdjacentDuplicates(String str) {
		
		Stack<Character> st1 = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			if(!st1.empty() && st1.peek()==str.charAt(i))
			{
				st1.pop();
			}else {
				st1.add(str.charAt(i));
			}
		}
		return st1.toString();
	}
	
}
