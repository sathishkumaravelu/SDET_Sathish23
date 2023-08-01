package mandatoryHomeWork.foundation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class p41_excelColumnTitleWithCharAt {

	@Test
	public void test() {

		int calculateExcelTitle = calculateExcelTitle("AAA");
		Assert.assertEquals(703, calculateExcelTitle);
	}

	@Test
	public void test1() {

		int calculateExcelTitle = calculateExcelTitle("A");
		Assert.assertEquals(1, calculateExcelTitle);
	}

	@Test
	public void test2() {

		int calculateExcelTitle = calculateExcelTitle("ZY");
		Assert.assertEquals(701, calculateExcelTitle);
	}

	public int calculateExcelTitle(String input) {

		int size = input.length() - 1;
		int loop = 0;
		int temp = 0;
		for (int i = size; i >= 0; i--) {
			temp = (int) (temp + ((input.charAt(i) - 'A' + 1) * (Math.pow(26, loop))));
			loop++;
		}

		return temp;
	}

}
