package mandatoryHomeWork.Week8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class HK_GameOfThrones {
	@Test
	public void example() {
		String s = "aaabbbb";
		System.out.println(findPalindrome(s));

	}

	private String findPalindrome(String s) {

		Map<Character, Integer> mp = new HashMap<>();

		for (Character ch : s.toCharArray()) {
			mp.put(ch, mp.getOrDefault(ch, 0) + 1);
		}
		int oddCounter = 0;
		// a=3, b=4
		for (Integer val : mp.values()) {
			if (val % 2 != 0) {
				oddCounter++;
			}
		}
		if(oddCounter>1) return "No"; 
		else return "Yes";
	}
}
