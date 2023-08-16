package mandatoryHomeWork.foundation.DailyAssignment;
import org.junit.Test;

public class Day2_SecondLargestDigit {

	/*
	 * replaceAll the string with ""
	 *  convert the string to int 
	 *  iterate the loop and
	 * check if 
	 * int[i]<int[i+1]
	 * { 
	 * retrun int[i+1] 
	 * }
	 * 
	 *  
	 */
	
	@Test
	public void test() {
		
		String secondLargetNum = checkSecondLargestDigit("dfa1321afd");
		System.out.println(secondLargetNum);
	}
	
	@Test
	public void test2() {
		
		String secondLargetNum = checkSecondLargestDigit("dfa42321afd");
		System.out.println(secondLargetNum);
	}
	
	@Test
	public void test1() {
		
		String secondLargetNum = checkSecondLargestDigit("abc1111");
		System.out.println(secondLargetNum);
	}
	
	public String checkSecondLargestDigit(String input) {
		
		String str = input.replaceAll("[^0-9]", "");
		System.out.println(str);
		
		//int convInt = Integer.parseInt(str);
		
		
		
		for (int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i)<str.charAt(i+1)) {
				char charAt = str.charAt(i+1);
				return ""+charAt;
			}else {
				return "-1";
			}
		}
		
		
		
		return "-1";
	}
	
	
}
