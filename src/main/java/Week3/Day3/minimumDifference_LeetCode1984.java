package Week3.Day3;

import org.junit.Test;

public class minimumDifference_LeetCode1984 {
//	You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. 
//	You are also given an integer k.
//	Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.
//	Return the minimum possible difference.

	// Points to Check:
	// 1) Did you understand the problem? - Yes
	// 2) Test data Set - Yes
	// 3) Do I know how to solve it? - Yes
	// 4) Ask for Hint? - No
	// 5) Do I know alternate solution as well? - Yes
	// 6) Find out the Big O Notation? - Yes
	// 7) Start always with pseudo code - Yes
	// 8) Implement the code in Editor, - Yes
	// 9) Test different set of data - Yes
	// 10) If it fails, debug them to solve it!! - Yes

//Pseudo Code:
//1) Create variable called differenceValue to store the difference value
//2) Consider left and right pointer, left is slow pointer and right is fast pointer
//3) Iterate the loop from left to right 
//4) In the inner loop, Iterate and compare left with each right elements and repeat the loop
//5) check condition if nums[left]>nums[right], subracte nums[left] - nums[right] else nums[right]-nums[left]
//6) store the difference value in variable called differenceValue		

	@Test
	public void example() {
		int[] nums = { 90 };
		//findMinDiff(nums);
	}

	@Test
	public void example1() {
		int[] nums = { 9, 4, 1, 7 };
		int k = 2;
		findMinDiff(nums,k);
	}

	@Test
	public void example2() {
		int[] nums = { 0, 4, 1, 7, 9 };
		//findMinDiff(nums);
	}

	private void findMinDiff(int[] nums, int k) {
		int differenceValue = 0, left = 0, right = 1;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				System.out.println(nums[i] + "," + nums[j]);
				if (nums[i] > nums[j])
					differenceValue = nums[i] - nums[j];
				else
					differenceValue = nums[j] - nums[i];
				System.out.println(differenceValue);
			}

		}
	}
}
