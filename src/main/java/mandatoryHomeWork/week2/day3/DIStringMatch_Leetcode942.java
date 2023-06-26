package mandatoryHomeWork.week2.day3;

import java.util.Arrays;

import org.junit.Test;

public class DIStringMatch_Leetcode942 {
//	A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:
//	s[i] == 'I' if perm[i] < perm[i + 1], and
//	s[i] == 'D' if perm[i] > perm[i + 1].
//	Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.

	// Points to Check:
	// 1) Did you understand the problem? - Yes
	// 2) Test data Set - Yes
	// 3) Do I know how to solve it? - Yes
	// 4) Ask for Hint? - No
	// 5) Do I know alternate solution as well? - Yes
	// 6) Find out the Big O Notation? - Yes
	// 7) Start always with pseudo code - Yes
	// 8) Implement the code in Editor, - Yes
	// 9) Test different set of data - Yes
	// 10) If it fails, debug them to solve it!! - Yes
	// Time Complexity:O(n)
	// space Complexity:O(n)

	// Pseudo Code:
//	1) Iterate a loop to traverse from 0 to n
//	2) Create two pointer left = 0, right = s.length
//	3) Create newIndexValue to store the values in new index
//	4) get the char using s.charAt(i) and check if the value is qual to 'I',
//	 if true store the left pointer value in new index value and incredent it
//	5) else store the right pointer value in new index
//	6) in the permutaion of n+1, check the last value of the string if 'I'then stroe the left value in the last index
//	7) else store the right pointer value

	@Test
	public void example() {
		String s = "IDID";
		System.out.println(Arrays.toString(findDiStringMatch(s)));
	}
	
	@Test
	public void example2() {
		String s = "III";
		System.out.println(Arrays.toString(findDiStringMatch(s)));
	}

	@Test
	public void example3() {
		String s = "DDI";
		System.out.println(Arrays.toString(findDiStringMatch(s)));
	}
	
private int[] findDiStringMatch(String s) {

	int left = 0, right = s.length(),newIndexPosition = 0,i = 0;
	int[] result =new int[s.length()+1];
	while(left<right)
	{
		if(s.charAt(i)=='I') result[newIndexPosition++] = left++;
		else result[newIndexPosition++] = right--;
		i++;
	}
	if(s.charAt(s.length()-1) == 'I') result[newIndexPosition] = left;
	else result[newIndexPosition] = right;
	
	return result;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

