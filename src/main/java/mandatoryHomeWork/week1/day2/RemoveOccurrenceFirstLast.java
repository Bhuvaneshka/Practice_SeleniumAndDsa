package mandatoryHomeWork.week1.day2;

import java.util.Arrays;

import org.junit.Test;

public class RemoveOccurrenceFirstLast {

//Psedocode:
//1) As per the array values, the first and last index values are holding Number 1, 
//since take first index  & last index . [int firstIndex & lastIndex]
//
//2) The expected output array size is different,so we need to create a new array with
//required array length.
//
//3) store the 1 in number variable.
//
//4) Loop the array and ignore array index 0 and arr.Length-1;
//
//5) store the remaining values in new array

	@Test
	public void example() {
		int[] arr1 = { 1, 2, 3, 4, 5, 1 };
		int num = 1;
		int[] result = removeOccurrence(arr1, num);
		System.out.println(Arrays.toString(result));
	}
	
	@Test
	public void example1() {
		int[] arr1 = { 1, 2, 1, 4, 5, 1 };
		int num = 1;
		int[] result = removeOccurrence(arr1, num);
		System.out.println(Arrays.toString(result));
	}
	
	//@Test
	public void example2() {
		int[] arr1 = { 1, 2, 1, 4, 5, 1 };
		int num = 1;
		int[] result = removeOccurrence(arr1, num);
		System.out.println(Arrays.toString(result));
	}


	private int[] removeOccurrence(int[] arr1, int num) {
		int firstIndex = 0, lastIndex = 0;
		
		//To find the first  index
		for (int j = 0; j <arr1.length; j++) {
			if (arr1[j] == num) {
				firstIndex = j;
				break;
			}
		}

		//To find the last first index
		for (int k = arr1.length - 1; k >= 0; k--) {
			if (arr1[k] == num) {
				lastIndex = k;
				break;
			}
		}
		
		// create new array with required length which is arr1.Length - 2
		int[] arr2 = new int[arr1.length - 2];

		
		// loop the array
		int m = 0;
		for (int i = 0; i <= arr1.length-1; i++) // 0 1<6
		{
			if (i != firstIndex && i != lastIndex) // 1!=0
			{
				arr2[m] = arr1[i]; 
				m++;
			}
		}
		System.out.println(Arrays.toString(arr2));
		return arr2;
	}
}
