package mandatoryHomeWork.foundation;

import org.junit.Test;

public class P57_CalculateMoneyLeetcodeBank {

	@Test
	public void test() {
		calculateMoney(7);
		calculateMoney(14);
		calculateMoney(5);
		calculateMoney(12);
	}

	public int calculateMoney(int day) {

		int temp = 0;
		int result = 0;
		int quo = 0;
		int rem = 0;
		int startValue = 0;
		int endValue = 0;

		quo = day % 7;
		rem = day / 7;

		if (quo == 0) {
			startValue = rem;
			endValue = 7 + (rem - 1);

		} else if (quo != 0) {
			startValue = rem + 1;
			endValue = rem + quo;

		}
		System.out.println(startValue + " " + endValue);
		for (int i = startValue; i <= endValue; i++) {
			temp = temp + i;
		}
		System.out.println(temp);
		if (quo == 0 && rem == 1) {
			result = 28 * quo + temp;

		} else {
			result = 28 * rem + temp;
		}

		System.out.println(result);
		return result;
	}

}
