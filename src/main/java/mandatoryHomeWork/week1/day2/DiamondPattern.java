package mandatoryHomeWork.week1.day2;

import org.junit.Test;

public class DiamondPattern {

	@Test
	public void example() {
		int n = 6;
		createDiamondPattern(n);
	}

	private void createDiamondPattern(int n) {

		for (int i = 0; i < n; i++) {
			for (int s = 0; s < n - i; s++) System.out.print(" ");
			for (int star = 0; star <= i; star++) System.out.print("* ");
			System.out.println();
		}

		for (int j = 1; j <= n - 1; j++) {
			for (int speace = 0; speace <= j; speace++) System.out.print(" ");
			for (int star = 0; star <= n - j - 1; star++) System.out.print("* ");
			System.out.println();
		}
	}
}
