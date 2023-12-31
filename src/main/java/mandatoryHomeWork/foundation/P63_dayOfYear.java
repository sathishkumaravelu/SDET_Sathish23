package mandatoryHomeWork.foundation;

import java.time.LocalDate;

import org.junit.Test;

public class P63_dayOfYear {

	@Test
	public void validTest() {
		
		String dayOfTheWeek = dayOfTheWeek(17, 7, 1999);
		System.out.println(dayOfTheWeek);
	}
	
	@Test
	public void validTest1() {
		
		String dayOfTheWeek = dayOfTheWeek(15, 8, 1993);
		System.out.println(dayOfTheWeek);
	}
	
    public String dayOfTheWeek(int day, int month, int year) {
        String answer = LocalDate.of(year, month, day).getDayOfWeek().toString();
        return answer.substring(0, 1).toUpperCase() + answer.substring(1).toLowerCase();
    }
	
}
