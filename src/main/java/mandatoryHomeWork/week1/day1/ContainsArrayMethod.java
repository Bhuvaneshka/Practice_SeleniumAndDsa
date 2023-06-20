package mandatoryHomeWork.week1.day1;

import java.awt.Checkbox;

import org.junit.Test;

public class ContainsArrayMethod {
//	3. Implement below methods using array
//	contains

	@Test
	public void example() {
		int[] arr1 = { 5, 7, 8, 9, 10 };
		int checkNumber = 9;
		Boolean result = checkContains(arr1, checkNumber);
		System.out.println(result);
	}
	
	@Test
	public void example1() {
		int[] arr1 = { 0, 0, 0, 0, 0 };
		int checkNumber = 9;
		Boolean result = checkContains(arr1, checkNumber);
		System.out.println(result);
	}
	
	@Test
	public void example2() {
		int[] arr1 = { -1 };
		int checkNumber = 9;
		Boolean result = checkContains(arr1, checkNumber);
		System.out.println(result);
	}

	private boolean checkContains(int[] arr1, int checkNumber) {
		boolean isContains = false;
		for(int i = 0; i<=arr1.length-1;i++)
		{
			if(arr1[i] == checkNumber)
			{
				isContains = true;
			}			
		}
		return isContains;
	}
}