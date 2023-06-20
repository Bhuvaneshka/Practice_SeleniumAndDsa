package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

import org.junit.Test;

public class AddArrayMethod {
//	3. Implement below methods using array
//	 add to the specific index

	@Test
	public void example() {
		int[] arr1 = { 5, 7, 8, 9, 10 };
		
//		Data for Add value in Array
		int indexValue = 1;
		int valueToInsert = 6;
		addValue(arr1, indexValue, valueToInsert);
		
	}

	//@Test
	public void example1() {
		int[] arr1 = { 1, 2, 3 };
		int indexValue = -1;
		int valueToInsert = 4;
		addValue(arr1, indexValue, valueToInsert);
		// output: throw exception
	}

	//@Test
	public void example2() {
		int[] arr1 = {};
		int indexValue = 3;
		int valueToInsert = 3;
		addValue(arr1, indexValue, valueToInsert);
		// output: throw exception
	}

	private void addValue(int[] arr1, int indexValue, int valueToInsert) {
		// create a new array
		int[] arr2 = new int[arr1.length + 1];

		// print the values in new array upto specified index value
		for (int i = 0; i < indexValue; i++) {
			arr2[i] = arr1[i];
		}

		// add the valueToInsert in the specified index
		for (int j = 0; j < arr2.length; j++) {
			if (j == indexValue)
				arr2[indexValue] = valueToInsert;
		}

		// print the remaining values in array 2
		for (int k = indexValue; k < arr1.length; k++) {
			arr2[k + 1] = arr1[k];
		}
		System.out.println(Arrays.toString(arr2));
	}
}
