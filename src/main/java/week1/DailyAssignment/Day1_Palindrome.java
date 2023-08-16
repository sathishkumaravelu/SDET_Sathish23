package week1.DailyAssignment;

import org.junit.Test;

public class Day1_Palindrome {
/*
 * input - > int
 * output boolean
 *  Test data :
 *  
 *  n=151
 *  n=23
 *  
 * 
 * 

store int n = 121
store n in another variable orginal
temp =0;

while(n>0){

    temp =temp*10 +n%10;
    n=n/10;

    return temp;
}

if(temp==orginal) return true else false
 * 
 */
	@Test
	public void test1()
	{
		int n=121;
		boolean checkPalindrome = checkPalindrome(n);
		System.out.println(checkPalindrome);
		
	}
	

	@Test
	public void test2()
	{
		int n=12;
		boolean checkPalindrome = checkPalindrome(n);
		System.out.println(checkPalindrome);
		
	}
	
	
	public boolean checkPalindrome(int num) {
		int orginal = num;
		int temp =0;

		while(num>0){

		    temp = temp*10+num%10;
		    num=num/10;
		   
		}

		if(temp == orginal) {
			return true;
		}else {
			return false;
		}
		
		
	}
}
