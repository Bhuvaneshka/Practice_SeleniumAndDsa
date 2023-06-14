package Week3.Day1;

import org.junit.Test;

public class Demo {

	@Test
	public void example1() {
		int[] nums = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		System.out.println(findMaxAverageSubarray(nums, k));
	}

	private double findMaxAverageSubarray(int[] nums, int k) {
		int temp = 0;
		double maxSum = 0;
		
		StringBuilder sb = new StringBuilder("Test");
		sb.replace(0, 1, "");
		System.out.println(sb.toString());
		
		
		for (int i = 0; i < k; i++) {
			temp = nums[i] + temp;
		}
		maxSum = temp;
		int left = 0;
		int right = k;
		double max = temp;
		while (right < nums.length) {
			max = max + nums[right] - nums[left];
			left++;
			right++;
			maxSum = Math.max(maxSum, max);
		}
		return maxSum / k;
	}
}
