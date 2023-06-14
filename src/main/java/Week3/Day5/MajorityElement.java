package Week3.Day5;

import org.junit.Test;

public class MajorityElement {

	@Test
	public void example() {
		int[] nums = { 3, 2, 3 };
		System.out.println(findMajorityElement(nums));
	}
	
	@Test
	public void example1() {
		int[] nums = { 2,2,1,1,1,2,2 };
		System.out.println(findMajorityElement(nums));
	}

	private int findMajorityElement(int[] nums) {
		int majorityValue = nums.length / 2;
		for (int num : nums) {
			int counter = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == num)
					counter++;
			}

			if (counter > majorityValue) {
				return num;
			}
		}
		return -1;
	}
}
