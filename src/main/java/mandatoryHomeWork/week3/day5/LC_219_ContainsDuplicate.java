package mandatoryHomeWork.week3.day5;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LC_219_ContainsDuplicate {
//https://leetcode.com/problems/contains-duplicate-ii/

	@Test
	public void example1() {
		int[] nums = { 1, 2, 3, 1 };
		int k = 3;
		System.out.println(findContainsDuplicate(nums, k));
	}
	
	@Test
	public void example2() {
		int[] nums = { 1,0,1,1 };
		int k = 3;
		System.out.println(findContainsDuplicate(nums, k));
	}
	
	@Test
	public void example3() {
		int[] nums = { 1,2,3,1,2,3 };
		int k = 2;
		System.out.println(findContainsDuplicate(nums, k));
	}

	private boolean findContainsDuplicate(int[] nums, int k) {
		Map<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(!hm.containsKey(nums[i]))
			{
				hm.put(nums[i], i);
			}
			else
			{
				int pastIndex = hm.get(nums[i]);
				if(Math.abs(pastIndex-i)<=k)
				{
					return true;
				}
				else
				{
				hm.put(nums[i], i);
				}
			}
		}
		return false;
	}
}
