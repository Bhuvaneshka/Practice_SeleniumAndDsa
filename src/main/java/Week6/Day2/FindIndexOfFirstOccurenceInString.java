package Week6.Day2;

import org.junit.Test;

public class FindIndexOfFirstOccurenceInString {

	/*
	 * Leetcode 28: Find the Index of the First Occurrence in a String
	 * 
	 * Given two strings needle and haystack, return the index of the first
	 * occurrence of needle in haystack, or -1 if needle is not part of haystack.
	 */

	/*
	 * Pseudo Code: 1) Create two pointers left=0 & right=needle.length() 2) Check
	 * condition if haystack.length()<needle.length(), return -1 3) Iterate from
	 * left to right in the haystack 4) Store each char in a single string 5)
	 * Compare the string value with needle 6) If the value matches, return the left
	 * pointer value and break it.
	 */

	@Test
	public void example1() {
		String haystack = "sadbutsad", needle = "sad";
		System.out.println(findTheIndex(haystack, needle));
//		output: 0
	}

	@Test
	public void example2() {
		String haystack = "butsasad", needle = "sad";
		System.out.println(findTheIndex(haystack, needle));
//		output: 3
	}

	@Test
	public void example3() {
		String haystack = "s", needle = "sad";
		System.out.println(findTheIndex(haystack, needle));
//		output: -1
	}

	@Test
	public void example4() {
		String haystack = "butsadsad", needle = "";
		System.out.println(findTheIndex(haystack, needle));
//		output: -1
	}

	@Test
	public void example5() {
		String haystack = "abbbbbcc", needle = "b";
		System.out.println(findTheIndex(haystack, needle));
//		output: 1
	}

	private int findTheIndex(String haystack, String needle) {
		int left = 0, right = needle.length()-1, counter = 0;
		String output = "";
		if (haystack.length() < needle.length())
			return -1;
		else {
			while (left < right) {
				for (int i = 0; i < right; i++) {
					counter++;
					output = output + haystack.charAt(i);
					System.out.println(output);
					if (output.equals(needle))
						return left;
					else continue;
				}
				left++;
				right=left+right;
				output="";
			}
		}
		return left;
	}
}
