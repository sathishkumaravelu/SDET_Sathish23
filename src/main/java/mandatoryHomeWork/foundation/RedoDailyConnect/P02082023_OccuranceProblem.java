package mandatoryHomeWork.foundation.RedoDailyConnect;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class P02082023_OccuranceProblem {
	@Test
	public void test() {
		boolean occurance = occurance(new int[] { 3, 3, 2, 2, 2, 1 });
		System.out.println(occurance);
		Assert.assertEquals(true, occurance);
	}

	@Test
	public void test1() {
		boolean occurance = occurance(new int[] { 3, 2, 2, 2, 1 });
		System.out.println(occurance);
		Assert.assertEquals(true, occurance);
	}

	public boolean occurance(int[] input) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < input.length; i++) {

			if (map.containsKey(input[i])) {
				int value = map.get(input[i]);
				map.put(input[i], value + 1);
			} else {
				map.put(input[i], 1);
			}

		}
		System.out.println(map);
		HashSet<Integer> valueSet = new HashSet<>(map.values());
		System.out.println(valueSet);

		if (map.size() == valueSet.size()) {

			return true;
		}

		return false;

	}
}
