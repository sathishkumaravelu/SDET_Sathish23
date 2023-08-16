package week1.DailyAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class Day3_RemoveTargetElement {

	@Test
	public void Test1() {

		int[] input = { 1, 2, 3, 3, 4 };
		
		List<Integer> expList = Arrays.asList(new Integer[] {1,2,4});
		
		
		List<Integer> checkndRemoveTargetEle = checkndRemoveTargetEle(input, 3);
		System.out.println(checkndRemoveTargetEle);
		Assert.assertEquals(expList, checkndRemoveTargetEle);

	}

	public List<Integer> checkndRemoveTargetEle(int[] input, int target) {

		List<Integer> op = new ArrayList<Integer>();

		for (int i = 0; i < input.length; i++) {

			if (input[i] != target) {
				op.add(input[i]);

			}

		}

		return op;
	}

}
