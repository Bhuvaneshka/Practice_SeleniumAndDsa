package mandatoryHomeWork.week6.day2;

import org.junit.Test;

public class LeetCode2540 {
	/*
	 * Leetcode 2540 Given two integer arrays nums1 and nums2, sorted in
	 * non-decreasing order, return the minimum integer common to both arrays. If
	 * there is no common integer amongst nums1 and nums2, return -1. Note that an
	 * integer is said to be common to nums1 and nums2 if both arrays have at least
	 * one occurrence of that integer.
	 * 
	 * Pseudocode: 1) Create two pointer a and b =0 2) Iterate from 0 to
	 * nums1.length()-1 3) check if nums1[a]==nums2[b] then return nums1[a] 4) else
	 * if nums1[a]>nums[b] && b!=nums2.length() then b++ else a++ 5) if conditions
	 * are not match return -1.
	 */

	@Test
	public void example1() {
		int[] nums1 = { 1, 2, 3, 4 };
		int[] nums2 = { 2, 3, 4 };
		findCommonMin(nums1, nums2);
//	 output: 2
	}

	@Test
	public void example2() {
		int[] nums1 = { 2 };
		int[] nums2 = { 2 };
		findCommonMin(nums1, nums2);
//	 output: 2
	}

	@Test
	public void example3() {
		int[] nums1 = { 2, 2, 3 };
		int[] nums2 = { 2 };
		findCommonMin(nums1, nums2);
//	 output: 2
	}

	@Test
	public void example4() {
		int[] nums1 = { 2, 2, 3 };
		int[] nums2 = { 1, 2 };
		findCommonMin(nums1, nums2);
//	 output: 2
	}

	@Test
	public void example5() {
		int[] nums1 = { 2, 2, 2 };
		int[] nums2 = { 2, 2, 2 };
		findCommonMin(nums1, nums2);
//	 output: 2
	}
	
	@Test
	public void example6() {
		int[] nums1 = { 1, 2, 2 };
		int[] nums2 = { 1, 2, 2 };
		findCommonMin(nums1, nums2);
//	 output: 2
	}

	private int findCommonMin(int[] nums1, int[] nums2) {
		int a = 0;
		int b = 0;
		while (a < nums1.length - 1) {
			if (nums1[a] == nums2[b]) {
				return nums1[a];
			} else if (nums1[a] > nums2[b] && b != nums2.length) {
				b++;
			} else {
				a++;
			}
		}
		return -1;
	}
}
