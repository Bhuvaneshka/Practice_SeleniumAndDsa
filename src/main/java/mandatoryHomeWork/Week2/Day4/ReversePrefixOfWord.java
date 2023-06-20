package mandatoryHomeWork.week2.day4;

import org.junit.Test;

public class ReversePrefixOfWord {
//	Leetcode - 2000
//	Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). 
//	If the character ch does not exist in word, do nothing.
//	For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). 
//	The resulting string will be "dcbaefd".
//	Return the resulting string.

//	Points to Check:
//		1)	Did you understand the problem? - Yes
//		2)	Test data Set - Yes
//		3)	Do I know how to solve it? - Yes
//		4)	Ask for Hint? - Yes
//		5)	Do I know alternate solution as well? - No
//		6)	Find out the Big O Notation? -  Yes
//		7)	Start always with pseudo code - Yes
//		8)	Implement the code in Editor, - Yes
//		9)	Test different set of data - Yes
//		10)	If it fails, debug them to solve it!! - Yes

//	Pseudo Code:
//		1) Convert the given string into char array
//		2) create loop to traverse from 0 to arr.length with condition ch[i]=='d'
//		3) if the condition is pass break the loop and return the index number
//		4) create two variable left and right 
//		5) create for loop to traverse from 0 to returned index value
//		6) In the inner loop, using two pointers swap the values
//		7) Finally convert the char array to string value
//	
//	Time Complexity = O[4n]
//	Space Complexity = O[1]

	@Test
	public void example() {
		String word = "abcdefd";
		char ch = 'd';
		ReverseString(word, ch);
	}

	@Test
	public void example1() {
		String word = "zyxzxe";
		char ch = 'z';
		ReverseString(word, ch);
	}

	@Test
	public void example2() {
		String word = "abcd";
		char ch = 'z';
		ReverseString(word, ch);
	}

	private void ReverseString(String word, char ch) {
		char[] chr = word.toCharArray();
		int lastIndexValue = 0;
		for (int i = 0; i < chr.length; i++) {
			if (chr[i] == ch) {
				lastIndexValue = i;
				break;
			}
		}

		int left = 0, right = lastIndexValue;
		while (left < right) {
			// swap and reverse the values
			char temp = chr[left];
			chr[left++] = chr[right];
			chr[right--] = temp;
		}
		String str = new String(chr);
		System.out.println(str);
	}
}
