package mandatoryHomeWork.week1.day3;

import java.util.Arrays;

import org.junit.Test;

public class RemoveAllOccurence {
//	3. Remove all occurrence of a number which is present in the given index number
//	input = {1,2,3,4,5,1}, indexToRemove = 5
//	output = {2,3,4,5}

//Pseudocode
//	1) Intialize the input array called arr1
//	2) Intialize the integer variable indexToRemove =5
//	3) Loop the Array and find the number of occurence of index 5
//	4) Create a new array with arr1.length-n
//	5) Create int m=0 to index the new array
//	6) create for loop and traverse left to right
//	7) if condition - if reverse index not matching with indexToRemove value then push the index value from arr1[i] to arr2[m]
//	8) return the arr2.

	@Test
	public void example1() {
		int[] arr1 = { 1, 2, 1, 4, 1, 1 };
		int indexToRemove = 5;
		removeOccurrence(arr1, indexToRemove);
	}

	private void removeOccurrence(int[] arr1, int indexToRemove) {
		int n=0;
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i] == arr1[indexToRemove])
			{
				n=n+1;
			}
		}
		
		//Create a new array length-n
		int[] arr2 = new int[arr1.length-n];
		
		int m=0;
		
		for(int j=0;j<=arr1.length-1;j++)
		{
			if(arr1[j] != arr1[indexToRemove])
			{
				arr2[m] = arr1[j];
				m++;
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
}
