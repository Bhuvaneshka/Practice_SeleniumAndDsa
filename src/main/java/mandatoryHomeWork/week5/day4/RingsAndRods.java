package mandatoryHomeWork.week5.day4;

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
		countPoints(rings);
	}

	public int countPoints(String rings) {
	    Map<Character, Set<Character>> cmap = new HashMap<>();
	    Set<Character> rodsWithAllColors = new HashSet<>();

	    for (int i = 0; i < rings.length(); i += 2) {
	        char color = rings.charAt(i);
	        char rod = rings.charAt(i + 1);

	        if (!cmap.containsKey(rod)) {
	        	cmap.put(rod, rodsWithAllColors);
	        }
	        
	        cmap.get(rod).add(color);

	        if (cmap.get(rod).size() == 3) {
	            rodsWithAllColors.add(rod);
	        }
	    }

	    return rodsWithAllColors.size();
	}
	
}



