package DateTimeAPI;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author VADI
 *
 */
public class DateTimeAPIDemo {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("---------");
		
		LocalDate d1 = LocalDate.of(2020, Month.APRIL, 01);
		LocalDate d2 = LocalDate.of(2021, Month.MARCH, 31);
		long numberOfDays = ChronoUnit.DAYS.between(d1, d2);
		System.out.println(numberOfDays);
		
		System.out.println("---------");
		List<LocalDate> dates = Stream.iterate(d1, date->date.plusDays(1))
				.limit(ChronoUnit.DAYS.between(d1, d2)+1)
				.collect(Collectors.toList());
		System.out.println(dates);
		
	}
	
}
