package edu.val.cle.atsistemas.java8;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AgruparNotas {
	
	record Estudiante (String nombre, int nota)
	{
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return this.nota == ((Estudiante)obj).nota;
		}
	}
	
	public static void main(String[] args) {
		
		List<Estudiante> le = Stream.generate(()-> new Estudiante("PEPE", new Random().nextInt(10))).limit(10).toList();
		
		//así agurpo a una lista de estudiantes por su nota
		Map<Integer, List<Estudiante>> m = le.stream().collect(Collectors.groupingBy(estudiante-> estudiante.nota));

		//mapa de nota y número de personas con esa nota 
		Map r = m.entrySet().stream().collect(Collectors.toMap( Map.Entry::getKey 
				/*(entry) -> entry.getKey()*/, (entry) -> entry.getValue().size()));
		
		//agrupar aporbados y suspensos
		Map<Boolean, List<Estudiante>> mays = le.stream().collect(Collectors.partitioningBy(estudiante->estudiante.nota>=5));
		
		Map nays = 	mays.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, (entry) -> entry.getValue().size()));
				
		System.out.println("Mostrando alumnos agrupados por aprobados y suspensos " + mays);
		System.out.println("Mostrando alumnos agrupados por nota " + m);
		System.out.println("Mostrando notas agrupados por cantidad" + r);
		System.out.println("Mostrando notas agrupados por cantidad de aprobados y suspensos" + nays);
		
	
			
		
		
				
	}

}
