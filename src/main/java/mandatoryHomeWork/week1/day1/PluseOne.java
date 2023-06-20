package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

import org.junit.Test;

public class PluseOne {

	//test data
	@Test
	public void example() {
		int[] arr1 = { -1 };
		System.out.println(Arrays.toString(prm1(arr1)));
	}

	@Test
	public void example1() {
		int[] arr1 = {9};
		System.out.println(Arrays.toString(prm1(arr1)));
	}

	static int[] prm1(int[] arr1) {
		for (int i = arr1.length - 1; i >= 0; i--) {
			// System.out.println(arr1[i]);
			if (arr1[i] < 9) {
				arr1[i]++;
				return arr1;
			}
			arr1[i] = 0;
		}

		int[] arr2 = new int[arr1.length + 1];
		for (int i = arr2[arr1.length-1]; i==9;) {
			arr2[0] = 1;
			return arr2;
		}
		arr2[0] = 1;
		return arr2;
	}
}
