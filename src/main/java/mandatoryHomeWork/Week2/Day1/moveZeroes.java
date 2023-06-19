package mandatoryHomeWork.Week2.Day1;

import java.util.Arrays;

import org.junit.Test;

public class moveZeroes {

//	Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//	Note that you must do this in-place without making a copy of the array.
//	Constraints:
//		1 <= nums.length <= 104
//		-231 <= nums[i] <= 231 - 1
//		Follow up: Could you minimize the total number of operations done?	

	
//	Pseudo Code:
//		1)	Create one variable newPositionIndex = 0, to save the value without affecting the relative order.
//		2)	Create for loop to traverse inside array with condition arr1[i] != 0, if the condition matches store the index value in newpositionIndex of the same array.
//		3)	Repeat the loop until the end, 0 to arr1.length-1.
//		4)	Finally to add the 0’s in the end, we need to calculate the arr1.length – newPosotionIndex count then we will get the remaining index count which needs to be set as 0 value and store the temp variable in Int temp = 0.
//		5)	To set the remaining index values as 0, create a loop and traverse from temp to arr1.length

	@Test
	public void example() {
		int[] arr1 = { 0, 1, 0, 3, 12 };
		moveZerosToEnd(arr1);
	}

	@Test
	public void example1() {
		int[] arr1 = { 0, 0, 0, 1 };
		moveZerosToEnd(arr1);
	}

	@Test
	public void example2() {
		int[] arr1 = { 0 };
		moveZerosToEnd(arr1);
	}

	@Test
	public void example3() {
		int[] arr1 = { 1, 3, 2, 5, 6 };
		moveZerosToEnd(arr1);
	}

	private void moveZerosToEnd(int[] arr1) {
		//arr1 = { 0, 1, 0, 3, 12 };
		int newPositionIndex = 0;
		// Loop to traverse
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != 0) {
				arr1[newPositionIndex++] = arr1[i];
			}
		}
		
		// Find the remaining no of indices
		int balanceIndices = arr1.length - newPositionIndex;
		//System.out.println(balanceIndices);

		for(int i = arr1.length-balanceIndices; i<arr1.length;i++)
		{
			arr1[i] = 0;
		}
		System.out.println(Arrays.toString(arr1));
	}
}
