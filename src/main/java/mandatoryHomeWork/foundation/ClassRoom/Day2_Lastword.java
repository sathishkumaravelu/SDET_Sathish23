package mandatoryHomeWork.foundation.ClassRoom;

import org.junit.Test;

public class Day2_Lastword {
	@Test
	public void test() {
		int lengthofLastWord = LengthofLastWord("hello world");
		System.out.println(lengthofLastWord);
	}

	@Test
	public void test1() {
		int lengthofLastWord = LengthofLastWord(" hello Sathish ");
		System.out.println(lengthofLastWord);
	}

	@Test
	public void test2() {
		int lengthofLastWord = LengthofLastWord(" Group6 ");
		System.out.println(lengthofLastWord);
	}

	public int LengthofLastWord(String st) {
		String trim = st.trim();
		// char[] charArray = st.toCharArray();
		int count = 0;
		for (int i = trim.length() - 1; i >= 0; i--) {

			if (trim.charAt(i) == ' ') {
				break;
			}
			count++;
		}
		return count;
	}
}
