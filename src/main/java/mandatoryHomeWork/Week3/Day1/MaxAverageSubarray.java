package mandatoryHomeWork.Week3.Day1;

import javax.management.BadAttributeValueExpException;

import org.junit.Test;

public class MaxAverageSubarray {
	/*
	 * You are given an integer array nums consisting of n elements, and an integer
	 * k. Find a contiguous subarray whose length is equal to k that has the maximum
	 * average value and return this value. Any answer with a calculation error less
	 * than 10-5 will be accepted.
	 * 
	 * 
	 * pseudocode:
	 * 1) Create variable double average = 0;
	 * 2) traverse 0 to k and add value using average = averge + arr[i];
	 * 3) get the averge value by dividing average/4;
	 * 4) After the loop create maxaverage and store the average value;
	 * 5) Travese another loop to implement sliding window;
	 * 6) using average = average - arr[i]/k and average = average + arr[i]/k
	 * 7) check if the average value if greater than the average then store the value to maxAverage and return it
	 * 
	 * 
	 * 
	 * 
	 * TIme Complexity: O(n)
	 * Space Complexity: O(i)
	 * 
	 */

	
	@Test
	public void example1() {
		int[] arr = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		System.out.println(findMaxAvgSubarray(arr, k));
	}
	
	@Test
	public void example2() {
		int[] arr = { 1 };
		int k = 4;
		System.out.println(findMaxAvgSubarray(arr, k));
	}
	
	@Test
	public void example3() {
		int[] arr = { 0, 0 };
		int k = 4;
		System.out.println(findMaxAvgSubarray(arr, k));
	}

	private double findMaxAvgSubarray(int[] arr, int k) {
		double average = 0;
		
		if(arr.length < k)
		{
			for(int i = 0; i<arr.length;i++)
			{
				average = average+arr[i]/k;
				return average;
			}
		}
		//sum of first 0 to k values
		for(int i=0; i<k;i++)
		{
			average = average + arr[i]/k;
		}
		
		double maxAverage = average;
		for(int i = 0;i<arr.length-k;i++)
		{
			int j = i+k;
			average = average-arr[i]/k;
			average = average+arr[j]/k;
			if(average>maxAverage)
			{
				maxAverage = average;
			}
		}
		return maxAverage;
	}
}
