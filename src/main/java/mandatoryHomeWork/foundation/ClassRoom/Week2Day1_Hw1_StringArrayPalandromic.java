package mandatoryHomeWork.foundation.ClassRoom;

import org.junit.Test;

import junit.framework.Assert;

public class Week2Day1_Hw1_StringArrayPalandromic {

	/*
	 * input string[] output string
	 * 
	 * ----- Test date :
	 * 
	 * words = ["abc","car","ada","racecar","cool"] "ada"
	 * 
	 * 
	 * 1. create a for loop with size of the input string
	 * 
	 * for(int i=0; i<=length;i++){ String temp=""; String Org = words[i] for(int
	 * j=words[i].length;j>=0;j--){
	 * 
	 * temp= temp+words[j];
	 * 
	 * } if(temp.equals(org)){ return temp; }else{ return null; }
	 * 
	 * 
	 */

	 @Test
	public void test() {
		String input[] = { "abc", "car", "ada", "racecar", "cool" };
		String checkArrayPalindrome = checkArrayPalindrome(input);
		Assert.assertEquals("ada", checkArrayPalindrome);
	}

	@Test
	public void test1() {
		String input[] = { "def", "ghi" };
		String checkArrayPalindrome = checkArrayPalindrome(input);
		Assert.assertEquals("", checkArrayPalindrome);
	}
	
	@Test
	public void test2() {
		String input[] = { "notapalindrome","racecar","aba" };
		String checkArrayPalindrome = checkArrayPalindrome(input);
		Assert.assertEquals("racecar", checkArrayPalindrome);
	}

	public String checkArrayPalindrome(String words[]) {

		for (int i = 0; i < words.length; i++) {
			String temp = "";
			String Org = words[i];
			System.out.println(Org);

			for (int j = words[i].length() - 1; j >= 0; j--) {
				String temp2 = words[i];
				temp = temp + temp2.charAt(j);
			}
			System.out.println(temp);
			if (temp.equals(Org)) {
				return temp;
			}
		}

		return "";

	}

}
