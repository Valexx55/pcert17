package jcp17.clasicas;

import java.util.Arrays;
import java.util.List;

public class MainSecciones {

	static String[] days = { "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };

	public static void main(String[] args) {

//What will the following code snippet print?
		int count = 0, sum = 0;
		do {
			if (count % 3 == 0)
				continue;
			sum += count;
		} while (count++ < 11);
		System.out.println(sum);
		
		 List<Integer> names = Arrays.asList(1, 2, 3);
		 

		/*
		 * var index = 0; for (var day : days) {
		 * 
		 * if (index == 3) { break; } else { continue; } index++; if
		 * (days[index].length() > 3) { days[index] = day.substring(0, 3); } }
		 * System.out.println(days[index]);
		 */
	}
}
