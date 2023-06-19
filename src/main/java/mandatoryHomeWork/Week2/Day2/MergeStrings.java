package mandatoryHomeWork.Week2.Day2;

import org.junit.Test;

public class MergeStrings {
//	You are given two strings word1 and word2. 
//	Merge the strings by adding letters in alternating order, starting with word1. 
//	If a string is longer than the other, append the additional letters onto the end of the merged string.
//	Return the merged string.

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

//	Time Complexity: O[n], Space Complexity: O[1]

//	Pseudo Code:
//		1) Create a empty string builder with ""
//		2) Count the length of the both string word1 and word2 and sum it.
//		3) Create a variable and store the sum value in it
//		4) Create a loop starts from 0 to sum value with condition i<sum
//		5) create a if statement with condition 1<str1.length
//		6) If the statement true then store the value in the string builder using append method
//		7) Create once more if statement paralelly with condition 0<str1.length
//		8) Using append method to store the value in the same string builder
//		9) Finally return the string

	@Test
	public void example() {
		String str1 = "abc";
		String str2 = "pqr";
		mergeString(str1, str2);
	}

	
	@Test
	public void example2() {
		String str1 = "a";
		String str2 = "";
		mergeString(str1, str2);
	}
	
	@Test
	public void example3() {
		String str1 = "a";
		String str2 = "gfdgdfgyte";
		mergeString(str1, str2);
	}
	private void mergeString(String str1, String str2) {
		
		StringBuilder sb = new StringBuilder("");
		int size = str1.length()+str2.length();
		
		for(int i=0;i<size;i++)
		{
			if(i<str1.length())
			{
				sb.append(str1.charAt(i));
			}
			if(i<str2.length())
			{
				sb.append(str2.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

}
