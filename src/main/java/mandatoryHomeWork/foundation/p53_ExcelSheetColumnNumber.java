package mandatoryHomeWork.foundation;

import org.junit.Test;

public class p53_ExcelSheetColumnNumber {

	@Test
	public void test() {
		String excelTitle = excelTitle(701);
		System.out.println(excelTitle);
	}

	public String excelTitle(int number) {

		String str = "";
		while (number > 0) {
			number--;
			str = str + (char) ((number % 26) + 'A');
			number = number / 26;
		}
		return str;
	}

}
