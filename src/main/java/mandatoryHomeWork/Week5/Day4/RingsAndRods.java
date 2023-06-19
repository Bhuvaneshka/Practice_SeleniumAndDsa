package mandatoryHomeWork.Week5.Day4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class RingsAndRods {

	@Test
	public void example1()
	{
		String rings = "B0B6G0R6R0R6G9";
		findRodWithAllColours(rings);
	}

	private void findRodWithAllColours(String rings) {
		Set<Character> uniqueValue = new HashSet(); 
		
		Map<Integer,Set<Character> > ringAndRod = new HashMap<>();
		for (int i = 0; i < rings.length(); i=i+2) {
			char colour = rings.charAt(i);
			char rods = rings.charAt(i+1);
//			B0B6G0R6R0R6G9
			
			//if()
		}
	}
	
}



