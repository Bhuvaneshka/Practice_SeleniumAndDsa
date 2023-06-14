package Week6.Day4;

import java.util.Arrays;

import org.junit.Test;

public class Leetcode832 {
	/*
	 * LeetCode: 832 Given an n x n binary matrix image, flip the image
	 * horizontally, then invert it, and return the resulting image. To flip an
	 * image horizontally means that each row of the image is reversed. For example,
	 * flipping [1,1,0] horizontally results in [0,1,1]. To invert an image means
	 * that each 0 is replaced by 1, and each 1 is replaced by 0. For example,
	 * inverting [0,1,1] results in [1,0,0].
	 * 
	 * Time Complexity: O(n^2)
	 * Space Complexity:O(1)
	 */
	@Test
	public void example1() {
		int[][] pic = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		print2D(flipImage(pic));
//		output: { { 1, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } }
	}

	@Test
	public void example2() {
		int[][] pic = { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };
		print2D(flipImage(pic));
	}

	private int[][] flipImage(int[][] pic) {

		// flip the image
		int n = pic.length;
		int left = 0;
		int right = n - 1;

		for (int i = 0; i < n; i++) {
			while (left <= right) {
				int temp = pic[i][left];
				pic[i][left] = pic[i][right];
				pic[i][right] = temp;
				left++;
				right--;
			}
		}

		for (int i = 0; i < pic.length; i++) {
			for (int j = 0; j < pic.length; j++) {
				if (pic[i][j] == 0) pic[i][j] = 1;
				else pic[i][j]=0;
			}
		}

		return pic;
	}
	
	private void print2D(int[][] pic)
	{
		for (int[] row : pic) {
			System.out.println(Arrays.toString(row));
		}
	}
}
