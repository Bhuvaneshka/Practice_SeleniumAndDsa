package mandatoryHomeWork.week4.day2;

import java.util.Stack;

import org.junit.Test;

public class BackSpaceStringCompare {
	/*
	 * 
	 * 
	 */
	@Test
	public void example() {
		String s = "#b#c";
		String t = "##g";
		System.out.println(findBackSpaceStringCompare(s, t));
	}

	private boolean findBackSpaceStringCompare(String s, String t) {

		Stack<Character> st1 = new Stack<>();
		Stack<Character> st2 = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '#') {
				st1.add(s.charAt(i));
			} else if(!st1.empty()){
				st1.pop();
			}
		}

		for (int j = 0; j < t.length(); j++) {
			if (t.charAt(j) != '#') {
				st2.add(t.charAt(j));
			} else if(!st2.empty()){
				st2.pop();
			}
		}

		if (st1.equals(st2)) {
			return true;
		}
		return false;
	}
}
