package mandatoryHomeWork.week4.day1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BaseBall {

//	You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
//	You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
//	An integer x.
//	Record a new score of x.
//	'+'.
//	Record a new score that is the sum of the previous two scores.
//	'D'.
//	Record a new score that is the double of the previous score.
//	'C'.
//	Invalidate the previous score, removing it from the record.
//	Return the sum of all the scores on the record after applying all the operations.
//	The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.

	// Pseudo Code:
//	1) Create an Linked list with datatype String
//	2) traverse in to the list using loop
//	3) check if the element inside the list if Integer number, if true add in the list.
//	4) else if the element equals to "C" remove the previous score using remove method
//	5) else if the element equals to "D" list.get(i-1) * 2 and store it
//	6) else if the element equals to "+" then sum the list.get(i-2) + list.get(i-1) then store the value
//	7) Create temp int variable to store the sum of the list elements
//	8) Create and iterate loop to add the values one by one using temp = list.get(i)+temp; 

	@Test
	public void example() {
		List<String> ls = new ArrayList<>();
		ls.add("5");
		ls.add("2");
		ls.add("C");
		ls.add("D");
		ls.add("+");

		System.out.println(ScoreBoard(ls));
	}

	private int ScoreBoard(List<String> ls) {

		List<String> result = new ArrayList<>();

		int i = 0;
		int size = 0;
		int temp = 0;

		if (ls.size() != 0) {
			// Traverse inside list
			for (String str : ls) {
				{
					if (ls.get(i) == "C") {
						ls.remove(i - 1);
					} else if (ls.get(i) == "D" && ls.get(i) != null) {
						temp = Integer.parseInt(ls.get(i - 1));
						temp = temp * 2;
						result.add("" + temp);
					} else if (ls.get(i) == "+" && ls.get(i) != null && ls.get(i - 1) != null) {
						temp = Integer.parseInt(ls.get(i)) + Integer.parseInt(ls.get(i - 1));
						result.add("" + temp);
					} else {
						result.add(ls.get(i));
					}
				}
			}
		}
		int sum = 0;
		for (int j = 0; j < ls.size(); j++) {
			sum += Integer.parseInt(ls.get(j));
		}
//		return Integer.parseInt(result.toString());
		return sum;
	}
}
