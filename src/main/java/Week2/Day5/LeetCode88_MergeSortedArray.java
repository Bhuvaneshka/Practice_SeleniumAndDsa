package Week2.Day5;

import java.util.Arrays;

import org.junit.Test;

public class LeetCode88_MergeSortedArray {
//	You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//	Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//	The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
//	To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. 
//	nums2 has a length of n.
	
	// Points to Check:
		// 1) Did you understand the problem? - Yes
		// 2) Test data Set - Yes
		// 3) Do I know how to solve it? - Yes
		// 4) Ask for Hint? - Yes
		// 5) Do I know alternate solution as well? - Yes
		// 6) Find out the Big O Notation? - Yes
		// 7) Start always with pseudo code - Yes
		// 8) Implement the code in Editor, - Yes
		// 9) Test different set of data - Yes
		// 10) If it fails, debug them to solve it!! - Yes
//Time Complexity: O[n]
//Space Complexity: O[1]
	
//Pseudo Code:
//	1) Create three pointers to i,j and k, here i and j are used to compare the values from num1 & Num2,
//		variable k is used to store the pointed index
//	2) Iterate the loop until i and j become less greater than > zero
//	3) inside the loop, check the if condition num1[i]<num2[j], if pass store the index value in k then decrement k value & j value
//	4) if the condition fails, store the i value in kth position then decrement both i and k

	@Test
	public void example()
	{
		int[] num1 = {1,2,3,0,0,0};
		int[] num2 = {2,5,6};
		int m = 3, n =3;
		mergeSort(num1, num2, m, n);
	}
	
	@Test
	public void example1()
	{
		int[] num1 = {1};
		int[] num2 = {};
		int m = 1, n =0;
		mergeSort(num1, num2, m, n);
	}
	
	public void example2()
	{
		int[] num1 = {0};
		int[] num2 = {1};
		int m = 0, n =1;
		mergeSort(num1, num2, m, n);
	}

	private void mergeSort(int[] num1, int[] num2, int m, int n) {
		int i = m-1, j = n-1, k = m+n-1;
		while(i>=0 && j>=0)
		{
			if(num1[i] < num2[j])
			{
				num1[k--] = num2[j--];
			}
			else
			{
				num1[k--] = num1[i--];
			}
		}
		System.out.println(Arrays.toString(num1));
	}
}
