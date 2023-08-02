package mandatoryHomeWork.foundation.RedoDailyConnect;

import org.junit.Test;

import junit.framework.Assert;

public class P02082023_StringLastIndexOfOne {

	@Test
	public void test() {
		int lastIndexOne = lastIndexOne("0001");
		System.out.println(lastIndexOne);
		Assert.assertEquals(3, lastIndexOne);
	}

	@Test
	public void test1() {
		int lastIndexOne = lastIndexOne("1000");
		System.out.println(lastIndexOne);
		Assert.assertEquals(0, lastIndexOne);
	}
	

	@Test
	public void test3() {
		int lastIndexOne = lastIndexOne("000");
		System.out.println(lastIndexOne);
		Assert.assertEquals(-1, lastIndexOne);
	}


	public int lastIndexOne(String input) {

		char[] charArray = input.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			if (charArray[i] == '1') {
				return i;
			}
		}
		return -1;

	}
}
