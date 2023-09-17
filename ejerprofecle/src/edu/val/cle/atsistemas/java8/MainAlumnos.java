package edu.val.cle.atsistemas.java8;

import java.util.ArrayList;
import java.util.List;

public class MainAlumnos {
	
	//TEO JAVA
	//NOVEDADES J8
	//CONCEPTO
	//INTERFACES FUNCIONALES
	//ANOTACIÓN
	//VETANJAS PROGRAMACIÓN FUNCIONAL/NO
	//ARRAY DE NÚMEROS --> maximo minimo media 1ª tradicional, después con OPTIONAL
	//STATSTICOS
	//SACAR DE ALUMNOS LA MEDIA CON STREAMS NO CON EL CAMPO
	//TESTS
	//CURSOS
	//EJERCICIO OLGA
	//VAR
	//NOVEDAES TEORICAS
	//NOTAS AGRUPAR NOTAS
	//EJEMPLO EXCEPCIONES TWR / TWR EXCECPIONES PROGRAPADAS EJEMPLO
	//morno no hace falta colelctos tolist en media superior 
	//dif foreach de colelction y stream entre https://stackoverflow.com/questions/23218874/what-is-difference-between-collection-stream-foreach-and-collection-foreach
	//mostrar solucion una pasada teeing
	//resoluci�n de ejercicios?
	//var
	//HTTP CLIENT 11 COMPLETAFLE FUTURE CHUCK NORRIS
	//modulos JSE JDK POR DEFECTO RROT MODULE // https://i.stack.imgur.com/RmdQm.png
	//TEO MODULOS/IMPRESI�N
	//TRYCATH CON RECURSOS DE MODULOS sacar a comandos y a ficheros
	//LOCALDATE TIME, LOCALTIME, LOCALDATE DATEFORMATTER --> DEPRECATED
	//INSTANCE OF
	//TEXT BLOCKS ejercicio OLGA
	//SWITCH NUEVO -
	
	//POR VER POR VERSION
	//J17 SEALED CLASSES
	//J16 RECORDS Y PATTERN MATCHING FOR INSTANCE OF
	//J15 TEXT BLOCKS
	//J14 SWITCH EXPRESIONS
	//J12 / J 13 NO TIENEN NOVEDADES COMO TAL
	//J10/J11 VAR HTTP CLIENT MODULE
	//J 9 MODULOS TRY CON RECURSOS MEJORADO
	//J 8 FECHAS
	

	

		
	
	
	public static void main(String[] args) {
		
		List<Alumno> laumnos = new ArrayList<>();
		laumnos.add(new Alumno("juan", "perez", 5));
		laumnos.add(new Alumno("juan", "perez", 6));
		laumnos.add(new Alumno("juan", "perez", 7));
		laumnos.add(new Alumno("juan", "perez", 8));
		
		imprimeAlumnos(laumnos, new AlumnoExcelente());

		imprimeAlumnos(laumnos, a-> a.getNmedia()>=8);
		
		
	}
	
	private static void imprimeAlumnos (List<Alumno> laumnos, CompruebaAlumno c)
	{
		for (Alumno a: laumnos)
		{
			if (c.test(a))
			{
				System.out.println("ALUMNO SUPERA prueba "+ a);
			}
		}
	}

}
