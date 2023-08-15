package mandatoryHomeWork.foundation.RedoDailyConnect;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AsListArray {

	@Test
	public void listLearning() {
		
	List<String> list = Arrays.asList( "A", "B", "C", "D");
	System.out.println(list);
	System.out.println(list.size());
	list.add("A");	
	System.out.println(list);
	
	}
}
