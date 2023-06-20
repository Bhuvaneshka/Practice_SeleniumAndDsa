package mandatoryHomeWork.week1.day4;

import org.junit.Test;

public class MissingNumber {

//	Given an array nums containing n distinct numbers in the range [0, n], 
//	return the only number in the range that is missing from the array.

//	Pseudocode:
//		1) Intialize a variable called actualSum to store the actual sum of arr[0] to arr[n].
//		2) loop the array from 0 to arr.length
//		3) Iterate and the arr[i] values sum using actualSum += arr1[i]
//		4) Create another variable called expectedSum
//		5) sum the expected array using function n*(n+1)/2 since it is in recursive format 
//		6) find the missing number = expectedSum - actualSum
//		7) Create a new variable called missingNumber and store the value
//		8) return the variable missingNumber
	
	
	@Test
	public void example() {
		int[] arr1 = {3,1,0};
		System.out.println(findMissingNumber(arr1));
	}

	@Test
	public void example1() {
		int[] arr1 = {0,1,2};
		System.out.println(findMissingNumber(arr1));
	}
	
	@Test
	public void example2() {
		int[] arr1 = {0};
		System.out.println(findMissingNumber(arr1));
	}
	
	private int findMissingNumber(int[] arr1) {
		int actualSum = 0;
		//Get the sum of actual array
		for(int i = 0; i<arr1.length;i++)
		{
			actualSum += arr1[i]; 
		}
		
		//get the sum of expected array
		int n = arr1.length;
		int expectedSum = n*(n+1)/2;
		
		//Get the missing Number
		int missingNumber = expectedSum - actualSum;
		return missingNumber;
	}
}
