package mandatoryHomeWork.week1.day1;

import org.junit.Test;

public class PyramidProgram {
	@Test
	public void example() {
		int n = 7;
		drawPyramid(n);
	}

	private void drawPyramid(int n) {
		//Loop for n items
		for(int i = 1; i<=n;i++)
		{
			//print the speace
			for(int s=1; s<=n-i;s++) 
			{
				System.out.print(" ");
			}
			
			//print the '*'
			for(int j = 1; j<=i;j++)
			{
				System.out.print("* ");
			}	
			System.out.println();
		}
	}
}
