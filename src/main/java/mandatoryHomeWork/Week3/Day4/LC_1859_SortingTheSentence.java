package mandatoryHomeWork.Week3.Day4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class LC_1859_SortingTheSentence {
//	https://leetcode.com/problems/sorting-the-sentence/

	@Test
	public void example1() {
		String s = "is2 sentence4 This1 a3";
		System.out.println(sortSentence(s));
	}
	
	@Test
	public void example2() {
		String s = "Myself2 Me1 I4 and3";
		System.out.println(sortSentence(s));
	}
	

	private String sortSentence(String s) {
		Map<Integer, String> indexWordMap = new HashMap<>();
		
		for(String word: s.split(" ")) {
			int lastIndex = word.length()-1;
			
			
			int index = word.charAt(lastIndex) - '0';
			String actualWord = word.substring(0,lastIndex);
			
			indexWordMap.put(index, actualWord);
		}
		
		StringBuilder actualString = new StringBuilder();
		for(Map.Entry<Integer, String> indexWord : indexWordMap.entrySet())
		{
			actualString.append(indexWord.getValue());
			actualString.append(" ");
		}
		
		return actualString.toString().trim();
	}
}
