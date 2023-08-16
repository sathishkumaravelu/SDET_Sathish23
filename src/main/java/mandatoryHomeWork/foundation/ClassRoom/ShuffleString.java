package mandatoryHomeWork.foundation.ClassRoom;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class ShuffleString {

	@Test
	public void test() {

		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		String input[] = { "c", "o", "d", "e", "l", "e", "e", "t" };
		String shuffleString = shuffleString(input, indices);
		Assert.assertEquals("[l, e, e, t, c, o, d, e]", shuffleString);
		//Assert.assertEquals("leetcode", shuffleString);
	}

	@Test
	public void test1() {

		int[] indices = { 0,2,1,4,3};
		String input[] = { "a", "c", "b", "e", "d" };
		String shuffleString = shuffleString(input, indices);
		Assert.assertEquals("[a, b, c, d, e]", shuffleString);
		//Assert.assertEquals("abcde", shuffleString);
	}
	
	public String shuffleString(String input[], int indices[]) {
		String[] strArray = new String[indices.length];
		for (int i = 0; i < indices.length; i++) {
			strArray[indices[i]] = input[i];
		}
		String op = Arrays.toString(strArray);
		System.out.println(op);
		return op;
	}

}
