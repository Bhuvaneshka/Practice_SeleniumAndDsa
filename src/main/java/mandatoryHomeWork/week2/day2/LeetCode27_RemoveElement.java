package mandatoryHomeWork.week2.day2;

import java.util.Arrays;

import org.junit.Test;

public class LeetCode27_RemoveElement {
//	Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. 
//	Then return the number of elements in nums which are not equal to val.
//	Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
//	Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
//	The remaining elements of nums are not important as well as the size of nums.
//	Return k.

//	Points to Check:
//		1)	Did you understand the problem? - Yes
//		2)	Test data Set - Yes
//		3)	Do I know how to solve it? - Yes
//		4)	Ask for Hint? - Yes
//		5)	Do I know alternate solution as well? - Yes
//		6)	Find out the Big O Notation? -  Yes
//		7)	Start always with pseudo code - Yes
//		8)	Implement the code in Editor, - Yes
//		9)	Test different set of data - Yes
//		10)	If it fails, debug them to solve it!! - Yes

//	Time Complexity: O[n], Space Complexity: O[1]
	
//	Pseudo Code:
//		1) Initialize three variables i,j,newIndexPosition.
//		2) variable i denotes starting index of the array,  
//		   variable j denotes ending index of the array,
//		   variable newIndexPosition denotes,new index position of the array
//		3) create a while loop to traverse into arrays with condition i<j
//		4) create if statement with arr1[i]!=val, if pass execute arr1[newIndexposition] = arr1[i]
//		5) then increment the newPositionIndex to store the values from 0th index of the same array
//		6) before while loop ends, increment the i value to execute until the last index of the array
	
	@Test
	public void example() {
		int[] arr1 = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		removeElement(arr1, val);
	}

	@Test
	public void example1() {
		int[] arr1 = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		removeElement(arr1, val);
	}

	@Test
	public void example2() {
		int[] arr1 = { 3, 2, 2, 3 };
		int val = 3;
		removeElement(arr1, val);
	}

	@Test
	public void example3() {
		int[] arr1 = { 3, 2, 2, 3 };
		int val = 3;
		removeElement(arr1, val);
	}

	private void removeElement(int[] arr1, int val) {
		int i = 0, j = arr1.length, newIndexPosition = 0;
		while (i < j) {
			if (arr1[i] != val) {
				arr1[newIndexPosition] = arr1[i];
				newIndexPosition++;
			}
			i++;
		}
		System.out.println("K = "+newIndexPosition+", Nums"+Arrays.toString(arr1));
	}
}
