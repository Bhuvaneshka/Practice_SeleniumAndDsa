package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

public class PrintArrayMethod {
//	3. Implement below methods using array
//	print the array value as string

	public void example() {
		// Data for remove value in Array
		int[] arr1 = { 10, 2, 7, 8 };
		printArray(arr1);
	}

	// Print Method
	private void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
