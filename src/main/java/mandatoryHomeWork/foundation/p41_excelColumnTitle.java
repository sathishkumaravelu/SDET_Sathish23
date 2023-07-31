package mandatoryHomeWork.foundation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class p41_excelColumnTitle {

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

		HashMap<Character, Integer> refMap = new HashMap<Character, Integer>();

		refMap.put('A', 1);
		refMap.put('B', 2);
		refMap.put('C', 3);
		refMap.put('D', 4);
		refMap.put('E', 5);
		refMap.put('F', 6);
		refMap.put('G', 7);
		refMap.put('H', 8);
		refMap.put('I', 9);
		refMap.put('J', 10);
		refMap.put('K', 11);
		refMap.put('L', 12);
		refMap.put('M', 13);
		refMap.put('N', 14);
		refMap.put('O', 15);
		refMap.put('P', 16);
		refMap.put('Q', 17);
		refMap.put('R', 18);
		refMap.put('S', 19);
		refMap.put('T', 20);
		refMap.put('U', 21);
		refMap.put('V', 22);
		refMap.put('W', 23);
		refMap.put('X', 24);
		refMap.put('Y', 25);
		refMap.put('Z', 26);

		int temp = 0;
		int indexOfchar =0;
		// zy --> 26(26^1) + 25(26^0)
		for (int i = input.length() - 1; i >= 0; i--) {

			Integer val = refMap.get(input.charAt(i));			
			temp = (int) (temp + (val * (Math.pow(26,indexOfchar ))));
			indexOfchar++;
		}

		System.out.println(temp);
		return temp;

	}

}
