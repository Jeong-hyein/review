package part2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static String today() {
		Date day = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		return format.format(day);
	}
	
	public static String strDate(Date date) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		return format.format(date);
	}
	public static String strDate(Date date, String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(date);
	}
}
