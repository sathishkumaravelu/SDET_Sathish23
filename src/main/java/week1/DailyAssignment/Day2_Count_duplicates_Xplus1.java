package week1.DailyAssignment;

import org.junit.Assert;
import org.junit.Test;

public class Day2_Count_duplicates_Xplus1 {

	/*
	 * input - int array output - int
	 * 
	 * Test data int [] ip = {1,2,3,1} op = 4
	 * 
	 * input = [1, 1, 3, 3, 5, 5, 7, 7] output = 0
	 * 
	 * 
	 */

	@Test
	public void test1() {
		int[] num = { 1, 2, 3, 4, 5, 6 };

		int count = findXplusOne(num);
		System.out.println("Test 1 " + count);

		Assert.assertEquals(5, count);
	}

	@Test
	public void test2() {
		int[] num = { 1, 1, 3, 3, 5, 5, 7, 7 };

		int count = findXplusOne(num);
		System.out.println("Test 2 " + count);

		Assert.assertEquals(0, count);
	}

	@Test
	public void test3() {
		int[] num = { 1, 2, 3,1 };

		int count = findXplusOne(num);
		System.out.println("Test 3 " + count);

		Assert.assertEquals(3, count);
	}

	public int findXplusOne(int[] num) { //1, 2, 3, 4, 5, 6
		int count = 0;

		for (int i = 0; i < num.length; i++) { 
			for (int j = 0; j < num.length; j++) {

				if (num[i] + 1 == num[j]) { 
					count++;   // 5
				}

			}
		}

		return count;
	}

}
