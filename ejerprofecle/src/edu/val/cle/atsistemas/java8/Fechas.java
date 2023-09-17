package edu.val.cle.atsistemas.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Fechas {

	
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		LocalDateTime ldt = LocalDateTime.now();
		LocalTime lt = LocalTime.now();

		DateTimeFormatter dtfldt = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		DateTimeFormatter dtfld = DateTimeFormatter.ISO_LOCAL_DATE;
		DateTimeFormatter dtflt = DateTimeFormatter.ISO_LOCAL_TIME;
		System.out.println(ldt.format(dtfldt));
		System.out.println(ld.format(dtfld));
		System.out.println(lt.format(dtflt));
		
		//Locale.setDefault(new Locale("es"));
		DateTimeFormatter dtfs = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);//5/3/23 18:00
		//DateTimeFormatter dtfs = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM); //5 mar 2023 17:59:05 inlcuye segundos
		DateTimeFormatter dtfl = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG); //incluyen zona
		//DateTimeFormatter dtfl = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL); //incluye zona con más detalle
	    System.out.println(dtfs.withLocale(new Locale("es")).format(ldt));
	    
	    
	    Locale aLocale = new Locale.Builder().setLanguage("es").build();//.setScript("Latn").setRegion("RS").build();
	    System.out.println(dtfs.withLocale(aLocale).format(ldt));

		//ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Kaliningrad"));
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Madrid"));
		//DateTimeFormatter dtfz = DateTimeFormatter.ISO_ZONED_DATE_TIME;
		System.out.println(dtfl.withLocale(new Locale("es")).format(zdt));
		
		//ZoneId.getAvailableZoneIds().stream().filter(s->s.contains("Europe")).forEach(zona->System.out.println(zona));
		
	}
}
