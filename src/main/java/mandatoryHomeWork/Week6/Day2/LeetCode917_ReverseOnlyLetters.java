package mandatoryHomeWork.Week6.Day2;

import org.junit.Test;

public class LeetCode917_ReverseOnlyLetters {
	/*
	 * LeedCode 917: Given a string s, reverse the string according to the following
	 * rules: All the characters that are not English letters remain in the same
	 * position. All the English letters (lowercase or uppercase) should be
	 * reversed. Return s after reversing it.
	 * 
	 * 
	 * pseudocode: 1) Create a mehtod to check the char is letters(both Lower &
	 * upper Case) or not 2) Find the left and right pointer index finding mid and
	 * left as mid-1, if odd right will be mid+1 or right = mid 3) loop left till
	 * greater than or equal to zero 4) if the char of both left and right is letter
	 * then swap it else increment or decrement the left and right 5) Return the
	 * string
	 */
	@Test
	public void example1() {
		String s = "ab-cd";
		System.out.println(ReverseLetters(s));
//		output= "dc-ba"
	}
	
	@Test
	public void example7() {
		String s = "--aB-----------";
		System.out.println(ReverseLetters(s));
//		output= "dc-ba"
	}

	@Test
	public void example2() {
		String s = "a-";
		System.out.println(ReverseLetters(s));
//		output= "a-"
	}

	@Test
	public void example3() {
		String s = "-";
		System.out.println(ReverseLetters(s));
//		output= "-"
	}

	@Test
	public void example4() {
		String s = "aAbB";
		System.out.println(ReverseLetters(s));
//		output= "BbAa"
	}

	@Test
	public void example5() {
		String s = "aAbB_1a";
		System.out.println(ReverseLetters(s));
//		output= "aBbA_1a"
	}

	private String ReverseLetters(String s) {
		int right = s.length() / 2;
		int left = right - 1;

		if (s.length() % 2 == 1)
			right++;
		char[] ch = s.toCharArray();

		while (left > 0) {
			char leftLetter = ch[left];
			char rightLetter = ch[right];
			if (!validateLetter(leftLetter)) {
				left++;
			} else if (!validateLetter(rightLetter)) {
				right++;
			} else {
				// swap
				char temp = leftLetter;
				leftLetter = rightLetter;
				rightLetter = temp;
				left--;
				right++;
			}
		}
		return new String(ch);
	}

	private boolean validateLetter(char ch) {
		if (ch == 'a' || ch == 'b' || ch == 'c' || ch == 'd' || ch == 'e' || ch == 'f' || ch == 'g' || ch == 'h'
				|| ch == 'i' || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'm' || ch == 'n' || ch == 'o' || ch == 'p'
				|| ch == 'q' || ch == 'r' || ch == 's' || ch == 't' || ch == 'u' || ch == 'v' || ch == 'w' || ch == 'x'
				|| ch == 'y' || ch == 'z' || ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D' || ch == 'E' || ch == 'F'
				|| ch == 'G' || ch == 'H' || ch == 'I' || ch == 'J' || ch == 'K' || ch == 'L' || ch == 'M' || ch == 'N'
				|| ch == 'O' || ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S' || ch == 'T' || ch == 'U' || ch == 'V'
				|| ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z') {
			return true;
		}
		return false;
	}
}
