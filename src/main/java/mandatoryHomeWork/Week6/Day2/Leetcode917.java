package mandatoryHomeWork.week6.day2;

import org.junit.Test;

public class Leetcode917 {
/*
	 * LeedCode 917: Given a string s, reverse the string according to the following
	 * rules: All the characters that are not English letters remain in the same
	 * position. All the English letters (lowercase or uppercase) should be
	 * reversed. Return s after reversing it.
	 * 
	 * 
	 */
	
	@Test
	public void example1() {
		String s = "ab-cd";
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
	
	@Test
	public void example6() {
		String s = "--aB-----------";
		System.out.println(ReverseLetters(s));
//		output= "aBbA_1a"
	}

	private String ReverseLetters(String s) {

		int start = 0;
		int end = s.length()-1;
		char ch[] = s.toCharArray();
		
		while(start<end) {
			if(!validateLetter(ch[start]))
			{
				start++;
			}else if(!validateLetter(ch[end]))
			{
				end--;
			}else {
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				start++;
				end--;
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
