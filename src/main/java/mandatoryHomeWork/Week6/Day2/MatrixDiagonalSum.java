package mandatoryHomeWork.Week6.Day2;

import org.junit.Test;

public class MatrixDiagonalSum {

	/*
	 * Leetcode:1572
	 * 
	 * Given a square matrix mat, return the sum of the matrix diagonals. Only
	 * include the sum of all the elements on the primary diagonal and all the
	 * elements on the secondary diagonal that are not part of the primary diagonal.
	 * 
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */

	@Test
	public void example1() {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(findMatrixDiagonalSum(mat));
	}
	
	@Test
	public void example2() {
		int[][] mat = { { 1, 1, 0 }, { 0, 1, 0 }, { 0, 1, 1 } };
		System.out.println(findMatrixDiagonalSum(mat));
	}

	private int findMatrixDiagonalSum(int[][] mat) {
		int start = 0;
		int end = mat.length - 1;
		int sum = 0;

		for (int i = 0; i < mat.length; i++) {
			if (start == end)
				sum -= mat[i][start];

			sum += mat[i][start] + mat[i][end];
			start++;
			end--;
		}
		return sum;
	}
}
