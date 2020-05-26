package lession21;

/**
 * The Main class to work datatime & calendar
 * 
 * @author ARTUR
 * @since JDK 13.0.2
 */

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main2 {

	public static void main(String[] args) {
		Date thisDate = new Date();

		System.out.println("Default this date = " + thisDate);
		System.out.println("local date " + lDate(thisDate));
		System.out.println("local time " + lTime(thisDate));
		System.out.println("local datetime " + lDateTime(thisDate));
		// calendar
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Calendar calendar = new GregorianCalendar();
		System.out.println("local date whith calendar " + dateFormat.format(calendar.getTime()));
		dateFormat = new SimpleDateFormat("H: mm: ss");
		System.out.println("local time whith calendar " + dateFormat.format(calendar.getTime()));
	}

	public static LocalDate lDate(Date d) {
		ZoneId systemDefault = ZoneId.systemDefault();
		return d.toInstant().atZone(systemDefault).toLocalDate();
	}

	public static LocalTime lTime(Date d) {
		ZoneId systemDefault = ZoneId.systemDefault();
		return d.toInstant().atZone(systemDefault).toLocalTime().withNano(0);
	}

	public static LocalDateTime lDateTime(Date d) {
		ZoneId systemDefault = ZoneId.systemDefault();
		return d.toInstant().atZone(systemDefault).toLocalDateTime().withNano(0);
	}

}
