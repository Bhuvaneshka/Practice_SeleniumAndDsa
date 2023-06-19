package mandatoryHomeWork.Week6.Day1;

import org.junit.Test;

public class LeetCode28_UsingIndexOf {
	/*
	 * Leetcode 28: Find the Index of the First Occurrence in a String
	 * Given two strings needle and haystack, return the index of the first
	 * occurrence of needle in haystack, or -1 if needle is not part of haystack.
	 */

	/*
	 * Pseudo Code: 1) Check condition if haystack.length()<needle.length(), return
	 * -1 2) Also check condition if needle.length()==0 then return -1 3) Check the
	 * needle value is present in the haystack 4) If it is present, then return the
	 * IndexOf the needle 5) Else return -1
	 */
//Time Complexity:O(n)
//space Complexity:O(1)

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
//		output: 5
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
		if (haystack.length() < needle.length() && needle.length() == 0) {
			return -1;
		} else {
			if (haystack.contains(needle))
				return haystack.indexOf(needle);
		}
		return -1;
	}

}
