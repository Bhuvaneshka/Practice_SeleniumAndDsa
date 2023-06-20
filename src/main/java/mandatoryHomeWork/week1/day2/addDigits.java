package mandatoryHomeWork.week1.day2;

import org.junit.Test;

public class addDigits {

	@Test
	public void example() {
		int n = 388;
		addDigitResult(n);
	}

	private void addDigitResult(int n) {
		// Given an integer num, repeatedly add all its digits until the result has only
		// one digit, and return it.
		
//		Example 1:
//			Input: num = 38
//			Output: 2
//			Explanation: The process is
//			38 --> 3 + 8 --> 11
//			11 --> 1 + 1 --> 2 
//			Since 2 has only one digit, return it.
//			
//		Example 2:
//			Input: num = 0
//			Output: 0
//			 
//			Constraints:
//
//			0 <= num <= 231 - 1
		
		int result = n%9;
		System.out.println(result);
	}
}
