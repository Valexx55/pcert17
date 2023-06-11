package jcp17.fechas;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class CuantoFalta {

	public static void main(String[] args) {

		LocalTime now = LocalTime.now();
		LocalTime gameStart = LocalTime.of(18, 15);
		long timeConsumed = 0;
		long timeToStart = 0;
		if (now.isAfter(gameStart)) {
			timeConsumed = gameStart.until(now, ChronoUnit.HOURS);
		} else {
			timeToStart = now.until(gameStart, ChronoUnit.HOURS);
		}
		System.out.println(timeToStart + " " + timeConsumed);
	}

}
