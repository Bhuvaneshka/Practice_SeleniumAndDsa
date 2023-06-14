package Week4.Day4;

import java.util.Stack;

import org.junit.Test;

public class MakeTheStringGreat {
	@Test
	public void example1() {
		String str = "leEeetcode";
		System.out.println(makeStringGreat(str));
	}

	private String makeStringGreat(String str) {
		Stack<Character> st1 = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			if (!st1.empty() && Math.abs((st1.peek() - str.charAt(i)))==32) {
				st1.pop();
			} else {
				st1.add(str.charAt(i));
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (Character ch : st1) {
			sb.append(ch);
		}
		return sb.toString();
	}
}
