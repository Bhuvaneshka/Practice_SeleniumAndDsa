package mandatoryHomeWork.Week3.Day5;

import org.junit.Test;

public class LeetCode744_FindSmallestLetter {
	/*
	 * Leetcode: 744 You are given an array of characters letters that is sorted in
	 * non-decreasing order, and a character target. There are at least two
	 * different characters in letters. Return the smallest character in letters
	 * that is lexicographically greater than target. If such a character does not
	 * exist, return the first character in letters.
	 * 
	 * Time Complexity: Space Complexity:
	 */
	@Test
	public void example() {
		char[] arr = { 'a', 'b', 'c' };
		char target = 'c';
		char findSmallest = findSmallest(arr,target);
		System.out.println(findSmallest);
	}

	private char findSmallest(char[] arr,char target) {
		char result = arr[0];
		int left = 0;
		int right = arr.length;
		while(left<right)
		{
			//find the mid value
			int mid = left + (right-left)/2;
			if(arr[mid]<target)
			{
				left = mid+1;
			}
			else if(arr[mid]==target)
			{
				right=mid+1;
			}else
			{
				result = arr[mid];
				right = mid-1;
			}
		}
		return result;
	}
}
