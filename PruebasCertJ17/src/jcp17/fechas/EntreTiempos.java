package jcp17.fechas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class EntreTiempos {

	
	public static void main(String[] args) {
		
		Duration d = Duration.between(LocalDateTime.now(), LocalDateTime.of(LocalDate.of(2022, Month.SEPTEMBER, 1), LocalTime.now()));
		System.out.println(d);//PT-8495H-59M-59.9939981S
		d = Duration.between(LocalDateTime.of(LocalDate.of(2022, Month.SEPTEMBER, 1), LocalTime.now()), LocalDateTime.now());
		System.out.println(d);//PT8496H
	}
}
