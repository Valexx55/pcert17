package edu.val.cle.atsistemas.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class MainCurso {
	
	/*
	 * Resolver los siguientes problemas.

Obtener la cantidad de cursos con una duración mayor a 5 horas. x
Obtener la cantidad de cursos con una duración menor a 2 horas. x 
Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50. x
Mostrar en consola el título de los 3 cursos con mayor duración. x
Mostrar en consola la duración total de todos los cursos. x
Mostrar en consola todos aquellos libros que superen el promedio en cuanto a duración se refiere.
Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.x
Obtener el curso con mayor duración.x
Crear una lista de Strings con todos los titulos de los cursos. x
*/
	
	
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
		cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
		cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
		cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
		cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));
		
		
		//OP INTERMEDIA
		
		//Obtener la cantidad de cursos con una duración mayor a 5 horas
		long ncursosmasde5 = cursos.stream().filter(c->c.getDuracion()>5).count();
		System.out.println("n cursos más de 5 = " + ncursosmasde5);
		//Obtener la cantidad de cursos con una duración menor a 2 horas
		long ncursosmenosde2 = cursos.stream().filter(c->c.getDuracion()<2).count();
		System.out.println("n cursos menos de 2 = " + ncursosmenosde2);
		//Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50
		List<String> titulosmas50 = cursos.stream().filter(c->c.getVideos()>50).map(c->c.getTitulo()).toList();
		System.out.println("Cursos con más de 50 = " + titulosmas50);
		//Mostrar en consola el título de los 3 cursos con mayor duración
		System.out.println("TOP 3 Cursos más largos ");
		cursos.stream().sorted((c1, c2) -> (int)(c2.getDuracion()-c1.getDuracion())).limit(3).forEach(c-> System.out.println(c.getTitulo()));
//		Mostrar en consola la duración total de todos los cursos.
		double sumacursos2 =  cursos.stream().mapToDouble(c->c.getDuracion()).sum();
		System.out.println("DURACIÓN TOTAL CURSOS " + sumacursos2);
		List<String> titulosmas = cursos.stream().map(c->c.getTitulo()).toList();
		System.out.println("Lista de Strings con todos los titulos de los cursos " + titulosmas);
		//Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500
		System.out.println("Titulos con menos de 500 alumnos ");
		cursos.stream().filter(c->c.getAlumnos()<500).forEach(c -> System.out.println(c.getTitulo()));
		//Obtener el curso con mayor duración
		System.out.println("Curso máxima duración ");
		cursos.stream().max((c1, c2) -> (int)(c1.getDuracion()-c2.getDuracion())).ifPresent(c-> System.out.println(c));
		//Mostrar en consola todos aquellos libros que superen el promedio en cuanto a duración se refiere.
		System.out.println("Curso con duración mayor a la media ");
		cursos.stream().sorted((c1, c2) -> (int)(c2.getDuracion()-c1.getDuracion())).limit(cursos.size()/2+1).forEach(c-> System.out.println(c.getTitulo()));
		
	}
	
	

}
