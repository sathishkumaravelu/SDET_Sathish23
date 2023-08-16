package mandatoryHomeWork.foundation.ClassRoom;

import org.junit.Test;

public class Day2_FindTheDifference {

	@Test
	public void test() {

		char charDiffer = findDifference("abcd", "abcde");
		System.out.println(charDiffer);
	}

	public char findDifference(String a, String b) {
		int[] arr = new int[26];
		for (char ch : a.toCharArray()) {

			arr[ch - 'a']++;
		}
		for (char ch : b.toCharArray()) {

			arr[ch - 'a']--;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1) {
				return (char) ((char) i + 'a');
			}
		}

		return ' ';

	}

}
