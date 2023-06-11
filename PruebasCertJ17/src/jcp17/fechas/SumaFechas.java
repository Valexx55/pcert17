package jcp17.fechas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class SumaFechas {
	
	public static void main(String[] args) {
		var date = LocalDate.of (2100, 5, 14);
		var time = LocalTime.of(9, 15);
		var dateTime = LocalDateTime.of(date, time);
		var d = Duration.of(1, ChronoUnit.HALF_DAYS);
		System.out.println(dateTime.plus(d));
	}

}
