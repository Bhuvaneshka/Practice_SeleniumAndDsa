package mandatoryHomeWork.Week3.Day4;

import org.junit.Test;

import junit.framework.Assert;

public class FindTheKbeauty {
//	The k-beauty of an integer num is defined as the number of substrings of num when it is read as a string that meet the following conditions:
//		It has a length of k.
//		It is a divisor of num.
//		Given integers num and k, return the k-beauty of num.
//		Note:
//		Leading zeros are allowed.
//		0 is not a divisor of any value.
//		A substring is a contiguous sequence of characters in a string.

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
	@Test
	public void example() {
		int num = 240, k = 2;
		System.out.println(FindTheBeautyOfTheNO(num, k));
	}

	@Test
	public void example1() {
		int num = 430043, k = 2;
		System.out.println(FindTheBeautyOfTheNO(num, k));
	}

	private int FindTheBeautyOfTheNO(int num, int k) {
		int counter = 0;
		String str = Integer.toString(num);
		for (int i = 0; i <= str.length() - k; i++) {
			String subStr = str.substring(i, i + k);
			int intValue = Integer.parseInt(subStr);
			if (intValue != 0 && num % intValue == 0) {
				counter++;
			}
		}
		return counter;
	}
}
