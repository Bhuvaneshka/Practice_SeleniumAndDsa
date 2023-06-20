package mandatoryHomeWork.week1.day3;

import org.junit.Test;

public class powerOfTwo {
	
//	Given an integer n, return true if it is a power of two. Otherwise, return false.
//
//	An integer n is a power of two, if there exists an integer x such that n == 2x.
	@Test
	public void example() {
		int n=38;
		System.out.println(findPowerOfTwo(n));
	}
	@Test
	public void example1() {
		int n=0;
		findPowerOfTwo(n);
		System.out.println(findPowerOfTwo(n));
	}
	@Test
	public void example2() {
		int n=1;
		findPowerOfTwo(n);
		System.out.println(findPowerOfTwo(n));
	}
	
	public boolean findPowerOfTwo(int n) {
		boolean result = true;
		
		if(n==0) {
			return false;
		}
		if(n==1) {
			return false;
		}
		if(n%2!=0) {
			return false;
		}
		return result;
	}
}
