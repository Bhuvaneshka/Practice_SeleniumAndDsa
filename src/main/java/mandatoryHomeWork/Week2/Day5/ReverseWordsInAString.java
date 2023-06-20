package mandatoryHomeWork.week2.day5;

import java.util.Arrays;

import org.junit.Test;

public class ReverseWordsInAString {
	// Given a string s, reverse the order of characters in each word within a
	// sentence while still preserving whitespace and initial word order.

	// Points to Check:
	// 1) Did you understand the problem? - Yes
	// 2) Test data Set - Yes
	// 3) Do I know how to solve it? - Yes
	// 4) Ask for Hint? - Yes
	// 5) Do I know alternate solution as well? - No
	// 6) Find out the Big O Notation? - Yes
	// 7) Start always with pseudo code - Yes
	// 8) Implement the code in Editor, - Yes
	// 9) Test different set of data - Yes
	// 10) If it fails, debug them to solve it!! - Yes

	// Pseudo Code:
	// 1) First split the string into words using str.Split()
	// 2) Iterate the loop from 0 to n times
	// 3) In the inner loop,iterate into each word and reverse the word
	// 4) Print the each word after reversing

	@Test
	public void example() {
		String str = "God Ding";
		reverseWord(str);
	}

	@Test
	public void example1() {
		String str = "Let's take LeetCode contest";
		reverseWord(str);
	}

	private void reverseWord(String str) {
		char[] ch = null;
		String[] words = str.split(" ");
		for (int j = 0; j < words.length; j++) {
			ch = words[j].toCharArray();
			for (int k = ch.length - 1; k >= 0; k--) {
				System.out.print(ch[k]);
			}
			System.out.print(" ");
		}
	}
}
