package mandatoryHomeWork.week4.day3;

import java.util.LinkedList;

import org.junit.Test;


public class RemoveLikedListElements {

	@Test
	public void example1()
	{
		LinkedList<Integer> ls = new LinkedList();
		ls.add(1);
		ls.add(2);
		ls.add(6);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);
		
		removeElement(ls);
	}

	private void removeElement(LinkedList<Integer> ls) {
		
	}
}
