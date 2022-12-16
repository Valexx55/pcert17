package jpc17.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PruebaFlujos {
	
	//La alternativa para generear el mismo resultado (71113) sin la linea 12 es la línea 14 FUNCIONA

	public static void main(String[] args) {
		Stream<Integer> strm1 = Stream.of(2, 3, 5, 7, 11, 13, 17, 19); // 1 
	/*alternativa a esta*/Stream<Integer> strm2 = strm1.filter(i->{ return i>5 && i<15; }); //2
		//NO COMPILA Stream<Integer> strm2 = strm1.filter(i>5).filter(i<15);
		//FUNCIONA!! //Stream<Integer> strm2 = strm1.parallel().filter(i->i>5).filter(i->i<15).sequential();
		//DEVUELVE un MAP NULO //Stream<Integer> strm2 = strm1.collect(Collectors.partitioningBy(i->{ return i>5 && i<15; })).get("true").stream();
		////este devuelve nullos cuando no se cumple la condición Stream<Integer> strm2 = strm1.map(i-> i>5?i<15?i:null:null);
		strm2.forEach(System.out::print); //3
	}

}
