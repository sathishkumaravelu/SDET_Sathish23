package mandatoryHomeWork.foundation.DailyAssignment;

import org.junit.Test;

public class Day1_JewelsProblem {

	@Test
	public void test() {

		int checkJewels = checkJewels("aA", "aAAbbbb");
		System.out.println(checkJewels);
	}
	
	@Test
	public void test1() {

		int checkJewels = checkJewels("z", "ZZ");
		System.out.println(checkJewels);
	}
	

	@Test
	public void test2() {

		int checkJewels = checkJewels("", "ZZ");
		System.out.println(checkJewels);
	}
	

	@Test
	public void test3() {

		int checkJewels = checkJewels("aabbc", "aAAbbbb");
		System.out.println(checkJewels);
	}

	public int checkJewels(String jewels, String stones) {

		int counter = 0;
		char[] jewelsArr = jewels.toCharArray();
		char[] stonesArr = stones.toCharArray();

		for (int i = 0; i < jewelsArr.length; i++) {

			for (int j = 0; j < stonesArr.length; j++) {

				if (jewelsArr[i] == stonesArr[j]) {
					counter++;
				}

			}

		}

		return counter;

	}

}
