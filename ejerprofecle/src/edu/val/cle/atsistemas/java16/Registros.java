package edu.val.cle.atsistemas.java16;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Los registros son como una clase restringida donde:
 * 
 * se crean por defecto
 * constructor
 * métodos get de acceso
 * equals
 * hashcode
 * toString
 * 
 * NO PUEDE MODIFICARSE EL VALOR
 * IDEAL PARA CONCURRECNCIA / SAFE THREAD
 * TODOS LOS ATRIBUTOS SON IMPLICTAMENTE FINAL//no pueden modifcarse
 * Ni heredan ni pueden ser heredados son final
 *puedo add metodos esstico o no pero nujnca modificart el estado del objeto
 *
 * 
 *
 */

public class Registros {
	
	
	
	public record Alumno(String nombre, String apellido, int nota)
	{
		/*@Override
		public boolean equals (Object o)
		{
			return true;
		}*/
		
		@Override
		public int nota ()
		{
			return this.nota+5;
		}
		
		/*public Alumno (String nombre, String apellido) 
		{
			this (nombre, apellido, 0);//Sobre la primera línea debe llamar a uno de los constructores
		}*/
		
		//CONSTRUCTOR COMPACTO. ACTÚA COMO CONSTRUCTOR POR DEFECTO
		//PERO PERMITE VALIDAR LA ENTRADA
		public Alumno  
		{
			if (nota!=5)
			{
				nota = 5; // o lanzar una excepción
			}
			//ejecuta el constructor largo automáticamente
		}
	}
	
	public static void main(String[] args) {
			
			List<Alumno> laumnos = new ArrayList<>();
			laumnos.add(new Alumno("juan", "perez", 5));
			laumnos.add(new Alumno("juan", "perez", 6));
			laumnos.add(new Alumno("juan", "perez", 7));
			laumnos.add(new Alumno("juan", "perez", 8));
			//laumnos.add(new Alumno("juana", "perez"));
			//laumnos.add(new Alumno());
			
			//ACCEDO
			for (Alumno a : laumnos)
			{
				System.out.println("APELLIDO = " + a.apellido());
				System.out.println("NOMBRE = " + a.nombre());
				System.out.println("NOTA = " + a.nota());
				System.out.println(a.toString());
				
				
				
			}
			
			System.out.println(laumnos.get(1).equals(laumnos.get(2)));
	}

}
