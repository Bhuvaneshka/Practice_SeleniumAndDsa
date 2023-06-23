package mandatoryHomeWork.week9.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GameOfTwoStacks {
//	https://www.hackerrank.com/challenges/game-of-two-stacks/problem

	@Test
	public void example() {
		int maxSum = 10;
		List<Integer> a = new ArrayList<>();
		a.addAll(Arrays.asList(1, 2, 3, 4, 5));

		List<Integer> b = new ArrayList<>();
		b.addAll(Arrays.asList(6,7,8,9));

		System.out.println(findGameOfTwoStacks(a, b, maxSum));
	}

	private int findGameOfTwoStacks(List<Integer> a, List<Integer> b,int maxSum) {
		int sum = 0;
		int aIndex= 0,bIndex=0;
		int aCounter = 0,bCounter = 0;
		int n = a.size();
		System.out.println(n);
		int m = b.size();
		System.out.println(m);
		
		while(aIndex<n && sum+a.get(aIndex)<=maxSum)
		{
			sum +=a.get(aIndex);
			aIndex++;
			aCounter++;
		}
		
		while(bIndex<m && aIndex>=0)
		{
			sum +=b.get(bIndex);
			if(sum>maxSum) {
				break;
			}
			bIndex++;
			bCounter++;
		}
		
		return aCounter+bCounter+1;
	}	
}
