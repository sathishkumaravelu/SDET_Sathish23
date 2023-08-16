package week1.DailyAssignment;

import org.junit.Test;

public class Day4_Climbing_Stairs {

	
	@Test
	public void Test1() {
		
		int n=2;
		int countStairs = countStairs(n);
		System.out.println(countStairs);
	}
	
	@Test
	public void Test2() {
		
		int n=5;
		int countStairs = countStairs(n);
		System.out.println(countStairs);
	}
	
	
	public int countStairs(int n) {
		
		int x=1,y=1,temp;
		for (int j = 0; j < n-1; j++) {
			temp=x; 
			x=x+y;
			y=temp;
		}
		System.out.println("Number ways the :" +x);
		return x;
	}
	
}
