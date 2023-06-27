package practiceDsa;

import org.junit.Test;

public class LC_443_StringCompression {
//	https://leetcode.com/problems/string-compression/

	/*
	 * Pseudocode:
	 * 
	 * 1) Iterate from 0 to s.length() 2) create a empty string builder called str
	 * 3) check if i and i+1 values are not equal then store the values in str 
	 * 4) In another iteration check if i and i+1 values are same increment the counter
	 * variable 
	 * 5) else and append the count in str and reset the counter = 1
	 * 
	 * Time Complexity : O(n) Space Complexity : O(0)
	 */

	@Test
	public void example() {
		char[] s = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
		System.out.println(findCompressedString(s));
	}

	private int findCompressedString(char[] s) {
		int counter = 1;
		int index = 0;
		for (int i = 1; i < s.length; i++) {
			char curr = s[i];
			char prev = s[i-1];
			if(i<s.length && curr == prev)
			{
				counter++;
			}else
			{
				s[index++] = s[i+1];
				if(counter > 1)
				{
					String tempStr = String.valueOf(counter);
					for(char c : tempStr.toCharArray())
					{
						s[index++] = c;
					}
				}
				counter=1;
			}
		}
		return index;
	}
}
