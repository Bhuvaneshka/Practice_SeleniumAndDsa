package mandatoryHomeWork.week2.day4;

import java.util.Arrays;

import org.junit.Test;

public class SortArrayByParity {
//	Leetcode 905
//	Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//	Return any array that satisfies this condition.

//	Points to Check:
//	1)	Did you understand the problem? - Yes
//	2)	Test data Set - Yes
//	3)	Do I know how to solve it? - Yes
//	4)	Ask for Hint? - Yes
//	5)	Do I know alternate solution as well? - No
//	6)	Find out the Big O Notation? -  Yes
//	7)	Start always with pseudo code - Yes
//	8)	Implement the code in Editor, - Yes
//	9)	Test different set of data - Yes
//	10)	If it fails, debug them to solve it!! - Yes

//	Pseudo Code:
//		1) Create and store the given integer array in variable called nums,
//		2) Create a variable called newIndexPosition to store the value in Place
//		3) Create a loop to traverse from 0 to nums.length-1
//		4) Create a if statement with condition if nums[i]%2 == 0 then print the array values in the newIndexPosition
//		5) create another if statement with condition if nums[i]%2 != 0 then print the array values in the current newIndexPosition
//		6) Finally print the nums array

	@Test
	public void example() {
		int[] nums = { 3, 1, 1, 8, 7, 4 };
		sortArray(nums);
	}

	@Test
	public void example1() {
		int[] nums = { 0 };
		sortArray(nums);
	}

	@Test
	public void example2() {
		int[] nums = { 2, 4, 6, 8 };
		sortArray(nums);
	}

	@Test
	public void example3() {
		int[] nums = { 1, 3, 2, 7 };
		sortArray(nums);
	}

	@Test
	public void example5() {
		int[] nums = { 3, 1, 2, 4 };
		sortArray(nums);
	}

	private void sortArray(int[] nums) {
		int start = 0, end = nums.length - 1;
		while(start<end) {
		while(start<end && nums[start] % 2 == 0) start++;
		while(start<end && nums[end] % 2 != 0) end--;
				int temp = nums[start];
				nums[start] = nums[end];
				nums[end] = temp;
		}
		System.out.println(Arrays.toString(nums));
	}
}
