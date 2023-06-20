package mandatoryHomeWork.week6.day3;

import org.junit.Test;

public class LeedCode2319 {
	/*
	 * LeedCode:2319
	 * 
	 * A square matrix is said to be an X-Matrix if both of the following conditions
	 * hold: All the elements in the diagonals of the matrix are non-zero. All other
	 * elements are 0. Given a 2D integer array grid of size n x n representing a
	 * square matrix, return true if grid is an X-Matrix. Otherwise, return false.
	 *
	 * 
	 * Time Complexity: O(m*n)
	 * space Complexity: O(1)
	 */

	@Test
	public void example1() {
		int[][] mat = { { 2, 0, 0, 1 }, { 0, 3, 1, 0 }, { 0, 5, 2, 0 }, { 4, 0, 0, 2 } };
		System.out.println(findSpecialOne(mat));
//		output: true
	}

	@Test
	public void example2() {
		int[][] mat = { { 5, 7, 0 }, { 0, 3, 1 }, { 0, 5, 0 } };
		System.out.println(findSpecialOne(mat));
//		output: false
	}

	@Test
	public void example3() {
		int[][] mat = { { 5, 0, 0 }, { 0, 3, 1 }, { 0, 5, 0 } };
		System.out.println(findSpecialOne(mat));
	}

	private boolean findSpecialOne(int[][] mat) {
		int n = mat.length;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (isDiagnnal(i, j, n)) {
					if (mat[i][j] == 0) {
						return false;
					}
				}
			}
		}
		return true;
	}

	private boolean isDiagnnal(int i, int j, int n) {
		return (i == j) || (i + j == n - 1);
	}
}
