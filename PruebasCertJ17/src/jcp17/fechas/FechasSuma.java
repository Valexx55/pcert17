package jcp17.fechas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.util.List;

public class FechasSuma {

	public static void main(String[] args) {
		java.time.LocalDate dt = java.time.LocalDate.parse("2015-01-01").minusMonths(1).minusDays(1).plusYears(1);
		System.out.println(dt);
		Period p = Period.between(LocalDate.now(), LocalDate.of(2022, Month.SEPTEMBER, 1));
		System.out.println(p);
		Duration d = Duration.between(LocalDateTime.now(), LocalDateTime.of(2022, Month.SEPTEMBER, 2, 10, 10));
		System.out.println(d);
	}

}
