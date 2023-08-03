package mandatoryHomeWork.foundation.RedoDailyConnect;

import org.junit.Test;

public class P030822023_multiplesOfN {

	@Test
	public void test1() {

		System.out.println(multiples(6));
	}

	public int multiples(int n) {

		int rem = 0;
		int output = 0;
		int count = 0;
		rem = n % 10;		
		if(n<5) {
			output=10;
		}else if (rem <= 5) {
			output = n - rem;
		} else if (rem > 5) {
			while (rem < 10) {
				rem++;
				count++;
			}
			output = n + count;

		}

		return output;

	}
}
