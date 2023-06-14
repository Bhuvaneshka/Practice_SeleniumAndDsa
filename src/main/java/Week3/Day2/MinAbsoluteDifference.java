package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MinAbsoluteDifference {

	/*
	 * Given an array of distinct integers arr, find all pairs of elements with the
	 * minimum absolute difference of any two elements.
	 * Return a list of pairs in ascending order(with respect to pairs), each pair
	 * [a, b] follows
	 * a, b are from arr a < b b - a equals to the minimum absolute difference of
	 * any two elements in arr
	 * 
	 * Pseusocode:
	 * 1) 
	 * 
	 * 
	 * Time Complexity: O(n log(n))
	 * Space Complexity:O(1)
	 * 
	 */

	@Test
	public void example() {
		int[] arr = {4,2,1,3};
		System.out.println(findAbsoluteDiff(arr));
	}

	private List<List<Integer>> findAbsoluteDiff(int[] arr) {
		
		int absValue = 0;
		Arrays.sort(arr);
		int maxValue = Integer.MAX_VALUE;
		
		List<List<Integer>> ll = new ArrayList<List<Integer>>();
		
		for (int i = 1; i < arr.length; i++) {
			absValue = arr[i-1]-arr[i];
			if(maxValue>absValue)
			{
				maxValue = absValue;
				ll.clear();
				ll.add(Arrays.asList(arr[i-1],arr[i]));
			}else if(maxValue == absValue)
			{
				 ll.add(Arrays.asList(arr[i - 1], arr[i]));
			}
		}
		return ll;
	}
}
