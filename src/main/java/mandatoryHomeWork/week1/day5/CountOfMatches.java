package mandatoryHomeWork.week1.day5;

import org.junit.Test;

public class CountOfMatches {
//	You are given an integer n, the number of teams in a tournament that has strange rules:
//
//		If the current number of teams is even, each team gets paired with another team. A total of n / 2 matches are played, 
//		and n / 2 teams advance to the next round.
//		If the current number of teams is odd, one team randomly advances in the tournament, 
//		and the rest gets paired. A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.

//		Return the number of matches played in the tournament until a winner is decided.

	@Test
	public void example() {
		int n = 7;
		findCountOfMatches(n);
	}

	@Test
	public void example1() {
		int n = 14;
		findCountOfMatches(n);
	}

	@Test
	public void example2() { 
		int n = 9;
		findCountOfMatches(n);
	}

	private void findCountOfMatches(int n) {
		int sum = 0;
		while (n > 1) {
			sum = sum + n / 2;
			n = (n / 2) + (n % 2);
		}
		System.out.println(sum);
	}
}
