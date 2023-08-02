package mandatoryHomeWork.foundation.RedoDailyConnect;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class P02082023_Missingnumber {

	@Test
	public void test() {
		int checkMissing = checkMissing(new int[] { 1, 2, 3, 5 }, 5);
		System.out.println(checkMissing);
		Assert.assertEquals(4, checkMissing);
	}

	@Test
	public void test1() {
		int checkMissing = checkMissing(new int[] { 4, 2, 3, 5 }, 5);
		System.out.println(checkMissing);
		Assert.assertEquals(1, checkMissing);
	}

	@Test
	public void test2() {
		int checkMissing = checkMissing(new int[] { 1, 4, 2, 3, 5 }, 6);
		System.out.println(checkMissing);
		Assert.assertEquals(6, checkMissing);
	}

	public int checkMissing(int[] input, int n) {

		Arrays.sort(input);

		for (int i = 0; i <= n - 1; i++) {
			if (i == n - 1) {
				return n;
			}
			if (input[i] != i + 1) {
				return i + 1;
			}

		}
		return 0;
	}
}