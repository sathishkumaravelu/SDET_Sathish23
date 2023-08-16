package mandatoryHomeWork.foundation.DailyAssignment;
import org.junit.Test;

public class Day3_PivotIndex {

	//@Test
	public void test() {

		int pivotIndex = pivotIndex(new int[] { 1, 7, 3, 6, 5, 6 });
		System.out.println(pivotIndex);
	}

	//@Test
	public void test1() {

		int pivotIndex = pivotIndex(new int[] { 1, 3, 5, 4, 3, 1 });
		System.out.println(pivotIndex);
	}

	//@Test
	public void test2() {

		int pivotIndex = pivotIndex(new int[] { 2, 1, -1 });
		System.out.println(pivotIndex);
	}

	//@Test
	public void test3() {

		int pivotIndex = pivotIndex(new int[] { 1, 2, -1 });
		System.out.println(pivotIndex);
	}

	//@Test
	public void test4() {

		int pivotIndex = pivotIndex(new int[] { 2, 3, -1, 8, 4 });
		System.out.println(pivotIndex);
	}
	
	@Test
	public void test5() {

		int pivotIndex = pivotIndex(new int[] { -1,-1,0,0,-1,-1});
		System.out.println(pivotIndex);
	}

	public int pivotIndex(int[] nums) {

		int sum = 0;
		for (int value : nums) {
			sum = sum + value;
		}
		int start = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum - nums[i];
			if (sum == start) {
				return i;
			}
			start = start + nums[i];
		}		
		return -1;
	}

}
