package mandatoryHomeWork.week1.day3;

import org.junit.Test;

public class RightPascalTriangle {

	@Test
	public void example() {
		int n = 6;
		drawRightPascalTriangle(n);
	}

	private void drawRightPascalTriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int star = 0; star <= i-1; star++)
				System.out.print("* ");
			System.out.println();
		}

		for (int j = 0; j <= n - 1; j++) {
			for (int star = 0; star <= n - j - 1; star++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
