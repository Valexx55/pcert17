package jcp17.fechas;

import java.sql.Types;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechasFormatos {
	
	public static void main(String[] args) {


		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("MM/YY"); //12/22
		//DateTimeFormatter sdf = DateTimeFormatter.ofPattern("mm/YY"); //error
		//DateTimeFormatter sdf = DateTimeFormatter.ofPattern("MM/yy"); //12/22
		//DateTimeFormatter sdf = DateTimeFormatter.ofPattern("mm/yy");//error
		System.out.println(sdf.format(LocalDate.now()));

		
	}

}
