package edu.val.cle.atsistemas.java8;

import java.util.Arrays;
import java.util.stream.Stream;

public class AlumnoExcelente implements CompruebaAlumno {
	
	@Override
	public boolean test(Alumno a) {
		
		//Arrays.stream(null)
		return a.getNmedia() >= 8;
	}

}
