package Week3.Day3;

import org.junit.Test;

public class SearchInsertPosition {
//	Given a sorted array of distinct integers and a target value, return the index if the target is found.
//	If not, return the index where it would be if it were inserted in order.
//	You mustwrite an algorithm with O(log n) runtime complexity.

	// Points to Check:
	// 1) Did you understand the problem? - Yes
	// 2) Test data Set - Yes
	// 3) Do I know how to solve it? - Yes
	// 4) Ask for Hint? - No
	// 5) Do I know alternate solution as well? - Yes
	// 6) Find out the Big O Notation? - Yes
	// 7) Start always with pseudo code - Yes
	// 8) Implement the code in Editor, - Yes
	// 9) Test different set of data - Yes
	// 10) If it fails, debug them to solve it!! - Yes

//Time Complexity:O(n)
//space Complexity:O(n)

	@Test
	public void example() {
		int[] nums = { 1, 3, 5, 6 };
		int target = 5;
		System.out.println(searchInsertPosition(nums, target));
	}

	@Test
	public void example1() {
		int[] nums = { 1, 3, 5, 6 };
		int target = 2;
		System.out.println(searchInsertPosition(nums, target));
	}

	@Test
	public void example2() {
		int[] nums = { 1, 3, 5, 6 };
		int target = 7;
		System.out.println(searchInsertPosition(nums, target));
	}

	private int searchInsertPosition(int[] nums, int target) {
		int left = 0 ;
        int right = nums.length-1;
      
       while(left<right){
            int mid = (left+right)/2;
           if(nums[mid]==target){
               return mid;
           }else if(nums[mid]<target){
               left = mid+1;
           }else right = mid-1;
       }
       
	return nums[left] >= target ? left : left+1;
//		return nums[left] >= target? left:left+1;
	}
}
