package mandatoryHomeWork.foundation.ClassRoom;

import org.junit.Test;

public class ExcelColumn {

	@Test
	public void test() {
		int checkColumnValue = checkColumnValue("B");
		System.out.println(checkColumnValue);
	}

	public int checkColumnValue(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result *= 26;
			result += s.charAt(i) - 'A' + 1;
		}
		return result;
	}
}
