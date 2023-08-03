package mandatoryHomeWork.foundation.RedoDailyConnect;

import org.junit.Test;

public class P03082023_ReverseNum {

	@Test
	public void test1() {

		System.out.println(reverseNum(491));
	}

	public String reverseNum(int input) {

		int rem = 0;
		String rev = "";
		while (input > 0) {

			rem = input % 10;
			rev = rev + rem;
			input = input / 10;

		}
		return rev;

	}
}
