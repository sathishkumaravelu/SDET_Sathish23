package Week4.Redo;

import org.junit.Test;

public class p23_StringHalves {
	
	@Test
	public void test() {
		
		String input = "testbook";
		
		String str1 = input.substring(0, input.length()/2);
		String str2 = input.substring(input.length()/2, input.length());
		
		System.out.println(str1);
		System.out.println(str2);
		
		int checkVowels = checkVowels(str2);
		System.out.println(checkVowels);
	}
	

	public int checkVowels(String s) {
		
		String vowels = "aeiouAEIOU";
		int count=0;
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {
				
				if(vowels.indexOf(s.charAt(i))==1) {
					count++;
				}
				
				
			}
		}
		return count;
	}
	
	
}
