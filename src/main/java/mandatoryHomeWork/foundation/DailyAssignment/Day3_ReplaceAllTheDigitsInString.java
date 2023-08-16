package mandatoryHomeWork.foundation.DailyAssignment;
import org.junit.Test;

public class Day3_ReplaceAllTheDigitsInString {

	@Test
	public void test() {
		
	 char[] value = replaceAllTheDigits("a1b1");
		System.out.println(value);
	}
	

	@Test
	public void test1() {
		
	 char[] value = replaceAllTheDigits("a1c1e1");
		System.out.println(value);
	}
	
	
	public char[] replaceAllTheDigits(String str) {
		
		char[] charArray = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			
			if(i%2!=0) {
				
				charArray[i]= (char) ((char) (charArray[i] + charArray[i-1]) -'0');
				
			}
			
			
		}
		return charArray;
	}
	
}
