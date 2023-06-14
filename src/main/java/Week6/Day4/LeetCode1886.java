package Week6.Day4;

import org.junit.Test;

public class LeetCode1886 {
/*LeetCode: 1886
 * Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, 
 * or false otherwise.
 * 
 * Time Complexity: 
 * Space Complexity: 
 */
	@Test
	public void example1()
	{
		int[][] mat = {{0,1},{1,0}};
		checkByRotate(mat);
		//output: true
	}
	
	@Test
	public void example2()
	{
		int[][] mat = {{0,1},{1,1}};
		checkByRotate(mat);
		//output: false
	}
	
	@Test
	public void example3()
	{
		int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
		checkByRotate(mat);
		//output: true
	}

	private boolean checkByRotate(int[][] mat) {
		
		return false;
	}
}
