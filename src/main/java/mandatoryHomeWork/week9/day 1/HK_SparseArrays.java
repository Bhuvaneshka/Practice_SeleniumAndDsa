package mandatoryHomeWork.week9.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class HK_SparseArrays {

//	https://www.hackerrank.com/challenges/sparse-arrays/problem

//	There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.

	@Test
	public void example() {
		List<String> stringList = Arrays.asList("ab", "ab", "abc");
		List<String> queries = Arrays.asList("ab", "abc", "bc");
		System.out.println(checkSparseArrays(stringList, queries));
	}

	private ArrayList<Integer> checkSparseArrays(List<String> stringList, List<String> queries) {

		Map<String, Integer> mp = new HashMap();

		for (String string : stringList) {
			if (mp.containsKey(string) == true) {
				mp.put(string, mp.get(string) + 1);
			} else {
				mp.put(string, 1);
			}
		}
		
		String s = "hai";
		char[] charArray = s.toCharArray();
		ArrayList<Integer> result  = new ArrayList<>();

		for (String qur : queries) {
			if(mp.containsKey(qur))
			{
				result.add(mp.get(qur));
			}else
			{
				result.add(0);
			}
		}
		return result;
	}
}



