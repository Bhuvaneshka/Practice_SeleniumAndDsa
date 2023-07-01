package practiceDsa;

import org.junit.Test;

public class BinarySearch_Ex1 {
//	https://leetcode.com/problems/find-smallest-letter-greater-than-target/

	/*
	 * Pseudocode 1) Initialize start and end 2) find mid of the char array using
	 * char mid = start+(end-start)/2; 3) check if target<mid, end =mid-1 4) else if
	 * target>mid, start = mid+1 5) outside the loop, check the modulo og start and
	 * return
	 * 
	 * 
	 * Time Complexity: O(n)
	 * space Complexity: O(0)
	 */
	
	@Test
	public void example1() {
		char[] letters = { 'c', 'f', 'j' };
		char target = 'a';
		System.out.println(findSmallestLetter(letters,target));
	}

	private char findSmallestLetter(char[] letters, char target) {
		
		int start = 0;
		int end = letters.length-1;
		
		while(start<=end)
		{
			int mid = start+(end-start)/2;
			if(target<letters[mid])
			{
				end = mid-1;
			}else
			{
				start = mid+1;
			}
		}
		return letters[start % (letters.length)];
	}
}
