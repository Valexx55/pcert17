package jpc17.enumerados;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;

public class EnumJ17 {

	/*
	 * 
	 * Al hacer String.valueOf (ENUMERADO) sale el string que asocias al declarar
	 * ese enumerado ENUMERADO("Valor String asociado");
	 */

	enum Coffee {
		ESPRESSO("Very Strong"), MOCHA("Bold"), LATTE("Mild");

		public String strength;

		Coffee(String strength) {
			this.strength = strength;
		}

		public String toString() {
			// return "Very Strong";
			return String.valueOf(strength);
		}
	}

//What can be done so that the above statement will print Very Strong?

	/*public static void main(String[] args) throws Exception {
		System.out.println(Coffee.ESPRESSO);*/
		// Coffee.valueOf("JUAN");-- error
		/*
		 * int y = 3;//011 int x = 5;//101 int z = y^x; System.out.println(z);
		 */
		// Collections.sort(Arrays.asList(1, 2, 3, 4), null);

		/*
		 * char[] a = { 'h', 'e', 'l', 'l'}; char[] b = { }; int x = Arrays.compare(a,
		 * b); int y = Arrays.mismatch(a, b); System.out.println(x+" "+y);
		 

//		int count = 0, sum = 0;
//		do{
//		       if(count % 3 == 0) continue;
//		       sum+=count;
//		}
//		while(count++ < 11);
//		System.out.println(sum);

	/*	LocalDateTime ld = LocalDateTime.of(2022, Month.OCTOBER, 31, 10, 0);
		ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
		date = date.plus(Duration.ofDays(1));
		System.out.println(date);
		date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
		date = date.plus(Period.ofDays(1));
		System.out.println(date);

	}*/
	
	/*public class TestClass {     
		public static void main(String[] args) throws Exception 
		{ //1           
			var flag  = true; //2          
			switch (flag){ //3              
			case true -> System.out.println("true");                  
			default -> System.out.println("false");          
			}                    
			} 
		}*/
	
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.parse("2022-02-05", DateTimeFormatter.ISO_DATE);         
		LocalDate d2 = LocalDate.of(2022, 2, 5);         
		LocalDate d3 = LocalDate.now();         
		System.out.println(d1);         
		System.out.println(d2);         
		System.out.println(d3);
		System.out.println(LocalDateTime.now());
		System.out.println(LocalTime.now());
	}
			


}
