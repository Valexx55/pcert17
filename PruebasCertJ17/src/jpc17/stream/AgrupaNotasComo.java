package jpc17.stream;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.random.RandomGenerator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AgrupaNotasComo {
	
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
		
		//asÃ­ agurpo a una lista de estudiantes por su nota
		Map<Integer, List<Estudiante>> m = le.stream().collect(Collectors.groupingBy(estudiante-> estudiante.nota));

		//mapa de nota y nÃºmero de personas con esa nota 
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
	public void remove(List<Character> chars) {
		   char end = 'z';
		  
		   Predicate<Character> predicate = c-> {
		      char start = 'a'; return start<=c&&c<= end; };

		   // INSERT LINE HERE
		      char c = 5;// ---------> FUNCIONA!!! PQ c, tiene sólo el ámbito de la lambda
		}
}
