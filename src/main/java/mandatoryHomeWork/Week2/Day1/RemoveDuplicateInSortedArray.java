package mandatoryHomeWork.week2.day1;

import java.util.Arrays;

import org.junit.Test;

public class RemoveDuplicateInSortedArray {
//	Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
//	The relative order of the elements should be kept the same. 
//	Then return the number of unique elements in nums.
//	Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
//	Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 
//	The remaining elements of nums are not important as well as the size of nums.
//	Return k.

//	Pseudo Code:
//		1) Create a variable newIndexPosotion = 0 to store the index values in new position which contains the unique values
//		2) Create for loop to traverse inside num array from 0 to arr1.length
//		3) Check the condition if arr1[i] == arr1[i+1] is pass then store the index value into arr1[newIndexPosition]
//		4) Repeat the loop until the loop ends
//		5) return the newIndexPosition which is K value along with the arr1 print

	@Test
	public void example() {
		int[] arr1 = { 1, 1, 1, 2, 3, 4, 4, 5 };
		removeDeplicates(arr1);
	}

	@Test
	public void example2() {
		int[] arr1 = { 1, 1, 2 };
		removeDeplicates(arr1);
	}

	@Test
	public void example3() {
		int[] arr1 = { 1, 2, 3, 4 };
		removeDeplicates(arr1);
	}

	@Test
	public void example4() {
		int[] arr1 = { 0, 0, 0, 0, 1 };
		removeDeplicates(arr1);
	}

	private void removeDeplicates(int[] arr1) {
		int newIndexPosition = 1;

		// for loop to compare the values
		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] != arr1[i - 1]) {
				arr1[newIndexPosition] = arr1[i];
				newIndexPosition++;
			}
		}

		System.out.println("K = " + newIndexPosition + " Array = " + Arrays.toString(arr1));
	}
}
