package jpc17.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReducingAndCollecting {

	public static void main(String[] args) {
		
		Stream<Integer> strm1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Map<Boolean, List<Integer>> ml =  strm1.collect(Collectors.partitioningBy(i->{ return i>5 && i<15; }));
		
		Stream<Integer> strm2 = strm1.collect(Collectors.partitioningBy(i->{ return i>5 && i<15; })).get(false).stream();
		strm2.forEach(System.out::println);
		//strm1.forEach(System.out::println);
		//int suma = strm2.reduce(0, (a,b)-> a+b);
		//System.out.println(suma);
		
		Supplier<Stream<String>> ss = () -> Stream.of("hola", "que");
		Supplier<String> ss1 = () -> "hola";
		Stream<String> strings = Stream.of("hola", "que");
		String concatenated = strings.reduce("joe", String::concat);
		String concatenated1 = ss.get().reduce("", String::concat);
		System.out.println(concatenated);
		System.out.println(concatenated1);
	}
	/**
	 *  <Map<Boolean, List<Integer>>, Object> Map<Boolean, List<Integer>>
	 * 
	 */

}
