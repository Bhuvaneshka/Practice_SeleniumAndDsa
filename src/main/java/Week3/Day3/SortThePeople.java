package Week3.Day3;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class SortThePeople {
//	You are given an array of strings names, and an array heights that consists of distinct positive integers. 
//	Both arrays are of length n.
//	For each index i, names[i] and heights[i] denote the name and height of the ith person.
//	Return names sorted in descending order by the people's heights.

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

//Time Complexity:O(n)
//space Complexity:O(n)

//Pseudo Code:
//1) Create HashMap with key value pair with Integer, String, Integer is used to store the height, String is used to store Names
//2) Iterate the loop and store the array values inside the map using put method
//3) Sort the heights array using Arrays.sort method
//4) create a empty string array with names.length size
//5) Iterate another for loop(right to left to get the items in decending order), get the key based on the value (height)
//6) and store the string to the new string array using a variable counter and increment it.

	@Test
	public void example() {
		int[] heights = { 165, 180, 170 };
		String[] names = { "Mary", "Emma", "John" };
		System.out.println(Arrays.toString(sortThePeople(heights, names)));
		//System.out.println(op.toString());
	}

	private String[] sortThePeople(int[] heights, String[] names) {
		HashMap<Integer, String> hm = new HashMap<>();

		for (int i = 0; i < names.length; i++) {
			hm.put(heights[i], names[i]);
		}

		Arrays.sort(heights);

		//String[] result = new String[names.length];
		int counter = 0;
		for (int i = heights.length-1; i >= 0; i--) {
			names[counter++] = hm.get(heights[i]);
		}
		return names;
	}

}
