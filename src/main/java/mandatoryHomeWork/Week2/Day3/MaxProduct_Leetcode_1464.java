package mandatoryHomeWork.week2.day3;

import org.junit.Test;

public class MaxProduct_Leetcode_1464 {
//	Given the array of integers nums, you will choose two different indices i and j of that array. 
//	Return the maximum value of (nums[i]-1)*(nums[j]-1).
	

//	Points to Check:
//		1)	Did you understand the problem? - Yes
//		2)	Test data Set - Yes
//		3)	Do I know how to solve it? - Yes
//		4)	Ask for Hint? - Yes
//		5)	Do I know alternate solution as well? - No
//		6)	Find out the Big O Notation? -  Yes
//		7)	Start always with pseudo code - Yes
//		8)	Implement the code in Editor, - 
//		9)	Test different set of data - 
//		10)	If it fails, debug them to solve it!! - 
	
//	Pseudo Code:
//		1) Create variable left=0, right=arr1.length(),
//		2) sort the array by comparing the two pointer values 
//		3) After sorting, find the last two indexes values (arr1.length-1,arr1.length-2)
//		4) Then implement the calculation given in the problem (nums[i]-1)*(nums[j]-1)
//		5) Create variable maxValue and store the final value and return it.
	
	@Test
	public void example()
	{
		int[] nums = { 3, 4, 5, 2 };
		System.out.println(mergeStrings(nums));
	}
	
	@Test
	public void example1()
	{
		int[] nums = { 1, 5, 4, 5 };
		System.out.println(mergeStrings(nums));
	}
	
	public static int mergeStrings(int[] nums) {
		
		int firstMaxValue = 0, secondMaxValue = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > firstMaxValue) {
				firstMaxValue = nums[i];
			}
		}
		
		for (int j = 0; j <= nums.length - 1; j++) {
			if (nums[j] < firstMaxValue && nums[j] > secondMaxValue) {
				secondMaxValue = nums[j];
			}
		}

		return firstMaxValue * secondMaxValue;
	}
}
