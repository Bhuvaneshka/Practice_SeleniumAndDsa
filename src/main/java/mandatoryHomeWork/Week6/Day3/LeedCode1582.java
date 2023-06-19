package mandatoryHomeWork.Week6.Day3;

import java.util.Arrays;

import org.junit.Test;

public class LeedCode1582 {

	/*
	 * LeetCode1582: Given an m x n binary matrix mat, return the number of special
	 * positions in mat. A position (i, j) is called special if mat[i][j] == 1 and
	 * all other elements in row i and column j are 0 (rows and columns are
	 * 0-indexed).
	 * 
	 * pseudocode:
	 * 
	 * time complexity: O(m*n)
	 * space complexity: O(1)
	 * 
	 */
	@Test
	public void example1() {
		int[][] mat = { { 1, 0, 0 }, { 0, 0, 1 }, { 1, 0, 0 } };
		System.out.println(findSpecialOne(mat));
	}
	
	@Test
	public void example2() {
		int[][] mat = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		System.out.println(findSpecialOne(mat));
	}
	
	@Test
	public void example3() {
		int[][] mat = { { 0, 0, 0 }, { 0, 1, 1 }, { 1, 0, 0 } };
		System.out.println(findSpecialOne(mat));
	}

	private int findSpecialOne(int[][] mat) {
		int count = 0;

		// find the length of columns and rows
		int r = mat.length;
		int c = mat[0].length;

		// get the count of rows and columns
		int rows[] = new int[r];
		int cols[] = new int[c];

		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (mat[i][j] == 0) {
					rows[i]++;
				}
			}
		}

		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				if (mat[j][i] == 0) {
					cols[i]++;
				}
			}
		}

		for (int x = 0; x < r; x++) {
			for (int y = 0; y < c; y++) {
				if (mat[x][y] == 1) {
					if (rows[x] == c - 1 && cols[x] == r - 1)
						count++;
				}
			}
		}
		return count;
	}
}
