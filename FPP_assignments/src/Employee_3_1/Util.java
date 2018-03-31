package Employee_3_1;

import java.text.DateFormat;
import java.time.LocalDate;

public class Util {
	public static String dateAsString(LocalDate hireDay) {
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
		return f.format(hireDay);
	}
	
}
