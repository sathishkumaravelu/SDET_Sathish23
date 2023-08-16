package mandatoryHomeWork.foundation.ClassRoom;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class checkAnagaram {

	@Test
	public void test() {
		String s = "test";
		String t = "rest";
		boolean checkAnagaram = checkAnagarams(s, t);
		Assert.assertEquals(false, checkAnagaram);
	}

	public Boolean checkAnagarams(String str, String str1) {
		char[] sArray = str.toCharArray();
		char[] tArray = str1.toCharArray();
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		if (Arrays.equals(sArray, tArray)) {
			return true;
		}
		return false;

	}
}
