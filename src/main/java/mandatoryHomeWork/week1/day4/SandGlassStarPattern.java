package mandatoryHomeWork.week1.day4;

import org.junit.Test;

public class SandGlassStarPattern {
//	Problem:
//	1. Sandglass Star Pattern
//	Enter the number of rows: 5
//
//	* * * * * 
//	 * * * * 
//	  * * * 
//	   * * 
//	    * 
//	    * 
//	   * * 
//	  * * * 
//	 * * * * 
//	* * * * * 

//Pseudo Code:
//	1) Create variable n for number of lines to be printed
//	2) Create outer loop to iterate from n to o
//	3) Create loop1 to print " "
//	4) Create loop2 to print "*"
//  5) Give a nextline for each iteration to print next line by next line
//	6) Create outer loop to iterate from 0 to n
//	7) Create loop1 to  and print " "
//	8) Create loop2 to print "*"
//	9) Give a nextline for each iteration to print next line by next line

	@Test
	public void example() {
		int n = 10;
		printSandGlassStar(n);
	}

	private void printSandGlassStar(int n) {
		
		
		for (int j = 0; j <= n - 1; j++) {
			// print the speace
			for (int speace = 0; speace <= j; speace++) {
				System.out.print(" ");
			}
			for (int star = 0; star < n - j ; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
				
		for (int j = 0; j <= n; j++) {
			// print the speace
			for (int speace = 0; speace < n - j; speace++) {
				System.out.print(" ");
			}

			// print the "*"
			for (int star = 0; star <= j; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
