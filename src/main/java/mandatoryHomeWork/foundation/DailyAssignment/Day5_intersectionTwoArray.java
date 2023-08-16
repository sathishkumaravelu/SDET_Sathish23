package mandatoryHomeWork.foundation.DailyAssignment;
import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class Day5_intersectionTwoArray {
	
	@Test
	public void test() {
		int[] checkIntersection = checkIntersection(new int[]{1,2,3,2,1}, new int[]{1,2,2,2,3});
		System.out.println(Arrays.toString(checkIntersection));
	}
	
	@Test
	public void test1() {
		int[] checkIntersection=checkIntersection(new int[]{2,1}, new int[]{3,4,5,1,1});
		System.out.println(Arrays.toString(checkIntersection));
	}
	
	public int[] checkIntersection(int [] arr1, int [] arr2){
		
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		
		for (int integer : arr1) {
			set1.add(integer);
		}
		for (int integer : arr2) {
			if(set1.contains(integer)) {
				set2.add(integer);
			}
		}
		int[] result = new int[set2.size()];
		int k=0;
		for (int i : set2) {
			result[k++]=i;
		}
		return result;
	}
}
