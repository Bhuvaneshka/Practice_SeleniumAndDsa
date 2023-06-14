package Week4.Day5;

import java.util.Stack;

import org.junit.Test;

public class LC_1598_CrawlerLogFolder {
	/*
	 * The Leetcode file system keeps a log each time some user performs a change
	 * folder operation.
	 * 
	 * The operations are described below: "../" : Move to the parent folder of the
	 * current folder. (If you are already in the main folder, remain in the same
	 * folder). "./" : Remain in the same folder. "x/" : Move to the child folder
	 * named x (This folder is guaranteed to always exist). You are given a list of
	 * strings logs where logs[i] is the operation performed by the user at the ith
	 * step.
	 * 
	 * The file system starts in the main folder, then the operations in logs are
	 * performed.
	 * 
	 * Return the minimum number of operations needed to go back to the main folder
	 * after the change folder operations.
	 * 
	 * 
	 */
	@Test
	public void example1() {
		String[] logs = { "d1/", "d2/", "../", "d21/", "./" };
		System.out.println(logFolder(logs));
	}

	private int logFolder(String[] logs) {

		Stack<String> st = new Stack<>();

		for (String log : logs) {
			if (log.equals("../") && !st.isEmpty()) {
				st.pop();
			} else if (log.equals("./")) {
				continue;
			} else {
				st.push(log);
			}
		}
		return st.size();
	}
}
