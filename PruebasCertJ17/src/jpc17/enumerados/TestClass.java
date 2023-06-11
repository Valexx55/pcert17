package jpc17.enumerados;

import java.time.LocalDate;
import static java.time.DayOfWeek.*;

public class TestClass {
	//int a;
	//static int a;
	public static void main(String[] args) {
		var day = LocalDate.now().with(FRIDAY).getDayOfWeek();
		switch (day) {
		case MONDAY:
			TUESDAY: WEDNESDAY: THURSDAY: FRIDAY: System.out.println("working");
		case SATURDAY:
			SUNDAY: System.out.println("off");
		}
		
		System.getProperties().keySet()
		
		for(var x:System.getProperties().entrySet())
		{
			var m = x.getKey(); 
		}
	}

	
}