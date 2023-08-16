package mandatoryHomeWork.foundation.DailyAssignment;
import org.junit.Test;

import junit.framework.Assert;

public class Day4_Maximum69Number {

	@Test
	public void test() {
		int value = maxi69(999);
		Assert.assertEquals(999, value);
	}

	@Test
	public void test1() {
		int value = maxi69(966669);
		Assert.assertEquals(999999, value);
	}

	@Test
	public void test2() {
		int value = maxi69(66669);
		Assert.assertEquals(99999, value);
	}

	public int maxi69(int num) {

		char[] charArray = String.valueOf(num).toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (i == charArray.length - 1) {
				if (charArray[i] == 57 && charArray[charArray.length - 1] == 54) {
					charArray[i + 1] = 57;
				}
			} else if (charArray[i] == 57 && charArray[i + 1] == 54) {
				charArray[i + 1] = 57;
			} else if (charArray[i] == 54) {
				charArray[i] = 57;
			}
		}

		System.out.println(charArray);

		return Integer.parseInt(new String(charArray));

	}
}
