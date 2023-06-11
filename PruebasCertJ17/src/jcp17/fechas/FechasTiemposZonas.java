package jcp17.fechas;

import java.time.*;

public class FechasTiemposZonas {

	public static void main(String[] args) {
		LocalDateTime ld = LocalDateTime.of(2022, Month.OCTOBER, 31, 10, 0);
		ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
		System.out.println(date);
		date = date.plus(Duration.ofDays(1));//Duraci�n habla de horas, tambi�n en d�as, ignorando el cambio de hora por ahrro de luz
		System.out.println(date);//suma un d�a, 24 horas
		date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
		date = date.plus(Period.ofDays(1));
		System.out.println(date);
	}

}
