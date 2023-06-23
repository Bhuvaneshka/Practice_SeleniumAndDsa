package practiceDsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class BaseBallGame {

	// Test Datas
	@Test
	public void example1() {
		String[] ops = { "5", "2", "C", "D", "+" };
		System.out.println(findScore(ops));
	}

	private int findScore(String[] ops) {
		int scoreValue = 0;
		Stack<String> st = new Stack();
		
		for (String each : ops) {
			st.push(each);
		}
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < ops.length; i++) {
			if (st.peek().equals("+") && !st.isEmpty() && list.size() < 2) {
				scoreValue = Integer.parseInt(ops[i - 1]) + Integer.parseInt(ops[i - 2]);
				list.add(scoreValue);
				st.pop();
			} else if (st.peek().equals("D") && list.size() < 1) {
				scoreValue = Integer.parseInt(ops[i - 1]) * 2;
				list.add(scoreValue);
				st.pop();
			} else if (st.peek().equals("C") && list.size() < 1) {
				scoreValue = Integer.parseInt(ops[i - 1]);
				st.pop();
			} else {
				scoreValue = Integer.parseInt(ops[i - 1]) * 2;
				list.add(scoreValue);
				st.pop();
			}
		}
		int result = 0;
		for (Integer each : list) {
			result = result + each;
		}

		return result;
	}
}
