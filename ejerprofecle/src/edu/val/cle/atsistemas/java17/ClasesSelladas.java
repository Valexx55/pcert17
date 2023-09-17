package edu.val.cle.atsistemas.java17;


public class ClasesSelladas {
	
	/**
	 * mecanismo para limitar la herencia de clases o interfaces
	 * las clases relacionadas deben estar en el mismo paquete
	 * o el el mismo modulo si es un named-module app
	 * 
	 * @author valer
	 *
	 */
	
	public sealed class Persona permits Alumno, Profesor {
		
	}
	
	public sealed class Alumno extends Persona permits AlumnoExcelente{
		
	}
	
	public final class Profesor extends Persona {
		
	}
	
	public non-sealed class AlumnoExcelente extends Alumno{
		
	}
	
	

}
