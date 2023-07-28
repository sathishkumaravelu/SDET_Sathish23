package mandatoryHomeWork.foundation;

import java.util.HashSet;

import org.junit.Test;

public class P13_Candies {

	@Test
	public void test() {

		int findCandies = findCandies(new int[] { 1, 1, 2, 2, 3, 3 });
		System.out.println(findCandies);
	}

	@Test
	public void test1() {

		int findCandies = findCandies(new int[] { 1, 1, 3, 3 });
		System.out.println(findCandies);
	}

	@Test
	public void test2() {

		int findCandies = findCandies(new int[] { 6, 6, 6, 6 });
		System.out.println(findCandies);
	}

	@Test
	public void test3() {

		int findCandies = findCandies(new int[] { 1, 2, 3, 4, 5, 6, 6, 7 });
		System.out.println(findCandies);
	}

	public int findCandies(int[] candies) {

		int maxCandies = candies.length / 2;
		HashSet<Integer> candiesSet = new HashSet<>();
		for (int i = 0; i < candies.length; i++) {
			candiesSet.add(candies[i]);
		}
		if (candiesSet.size() > maxCandies) {
			return maxCandies;
		} else {
			return candiesSet.size();
		}
	}

}
