package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

import org.junit.Test;

public class removeArrayMethod {
	
	@Test
	public void example()
	{
		int[] arr1 = { 10, 2, 7, 8 };
		int valueToRemove = 10;
		removeValue(arr1, valueToRemove);
	}
	
	@Test
	public void example1()
	{
		int[] arr1 = { };
		int valueToRemove = 1;
		removeValue(arr1, valueToRemove);
	}
	
	@Test
	public void example2()
	{
		int[] arr1 = {1};
		int valueToRemove = 1;
		removeValue(arr1, valueToRemove);
	}
	
	//Remove the value method
		private void removeValue(int[] arr1, int valueToRemove)
		{
			int[] arr2 = new int[arr1.length-1];
			int m = 0;
			for(int i =0; i<=arr1.length-1;i++)
			{
				if(arr1[i] != valueToRemove)
				{
					arr2[m] = arr1[i];
					m++;
				}
			}
			System.out.println(Arrays.toString(arr2));
		}
}
