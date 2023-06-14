package Week3.Day1;

import org.junit.Test;

public class SubstringOfSize3_LeetCode1876 {
//	A string is good if there are no repeated characters.
//	Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.
//	Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
//	A substring is a contiguous sequence of characters in a string.

//Points to Check:
//1) Did you understand the problem? - Yes
//2) Test data Set - Yes
//3) Do I know how to solve it? - Yes
//4) Ask for Hint? - No
//5) Do I know alternate solution as well? - Yes
//6) Find out the Big O Notation? - Yes
//7) Start always with pseudo code - Yes 
//8) Implement the code in Editor, - Yes
//9) Test different set of data - Yes
//10) If it fails, debug them to solve it!! - Yes
	
//Pseudo Code:
//1) Iterate the loop from o to s.length-2, 
//	here we are giving length-2 to avoid outofbound exception
//2) we need to compare the first three values for the first sliding values,
//3) The substring value of "xyz" will be consider first.
//4) Compare the substring characters and find the unique values like 
//	s.charAt(i)!=s.charAt(i+1) &&  s.charAt(i+1)!=s.charAt(i+2) && s.charAt(i+2)!=s.charAt(i)
//5) if the above condition pass, increase one count in the counter variable

	@Test
	public void example() {
		String s = "xyzzaz";
		findGoodString(s);
	}
	
	@Test
	public void example1() {
		String s = "aababcabc";
		findGoodString(s);
	}

	private void findGoodString(String s) {
		int counter = 0;
		
		for (int i = 0; i < s.length()-2; i++) {
			if(s.charAt(i) != s.charAt(i+1) && 
			   s.charAt(i+1) != s.charAt(i+2) &&
			   s.charAt(i+2) != s.charAt(i))
			{
				counter++;
			}
		}
		System.out.println(counter);
	}
}
