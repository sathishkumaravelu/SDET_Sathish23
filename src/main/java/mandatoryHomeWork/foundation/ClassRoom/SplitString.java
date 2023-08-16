package mandatoryHomeWork.foundation.ClassRoom;

import org.junit.Test;

public class SplitString {

	/*
	 * input --> string output --> boolean
	 * 
	 * constrain : split the input and need to check if vowels, (aeiou,AEIOU) ,
	 * array 1 == array 2
	 * 
	 * 
	 * Test Data : s = "book" o/p - true
	 * 
	 * 
	 * Psuedo code
	 * 
	 * 1. store the input in array
	 * 
	 * 2. size = input.length()/2; 3. str1 = s.substring(0,size) str2 =
	 * s.substring(n/2)
	 * 
	 * be // ee
	 * 
	 * if(str1.contains('a'eiou,AEIOU)&&str2.contains(aeiou,AEIOU)){
	 * 
	 * for(i=o;i<=str1.length;i++){
	 * 
	 * if(str1.chatAt(i).contains(aeiou,AEIOU){
	 * 
	 * count1 =count1+1;
	 * 
	 * }
	 * 
	 * if(str2.chatAt(i).contains(aeiou,AEIOU){
	 * 
	 * count2 =count1+1;
	 * 
	 * }
	 * 
	 * 
	 * }else{
	 * 
	 * return false } return count1== count2;
	 * 
	 * 
	 */

	@Test
	public void test() {
		String test = "book";
		boolean checkVowels = checkVowels(test);
		System.out.println(checkVowels);
	
	}

	public boolean checkVowels(String input) {
		
		String vowels="aeiouAEIOU";
		int size = input.length()/2;
		String str1 = input.substring(0,size);
				String str2 = input.substring(size);
		
		System.out.println(str1);
		System.out.println(str2);
		int count1=0;
		int count2=0;
		for (int i = 0; i < str1.length(); i++) {
			
			if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u'
					||str1.charAt(i)=='A'||str1.charAt(i)=='E'||str1.charAt(i)=='I'||str1.charAt(i)=='O'||
					str1.charAt(i)=='U') {
				
				count1 = count1+1;
			}
			if(str2.charAt(i)=='a'||str2.charAt(i)=='e'||str2.charAt(i)=='i'||str2.charAt(i)=='o'||str2.charAt(i)=='u'
					||str2.charAt(i)=='A'||str2.charAt(i)=='E'||str2.charAt(i)=='I'||str2.charAt(i)=='O'||
							str2.charAt(i)=='U') {
				
				count2 = count2+1;
			}
			
		}
		
		
		
		
		return count1==count2;
	}

}
