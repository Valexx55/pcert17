package jpc17.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PruebaLibroOCPCollectReduce {
	
	public static void main(String[] args) {
		
		Collection<String> results = List.of ("ala","Aa","AAa","ap","ba");
		Long countOfAWords = results.stream().reduce(
			    0L,
			    (a, b) -> b.charAt(0) == 'A' ? a + 1 : a,
			    Long::sum);
		System.out.println(countOfAWords);
		
				
		List<String> ls = results.stream().collect(ArrayList<String>::new, (a,  b)-> {if (b.startsWith("A")) a.add(b);} , List::addAll);
		System.out.println(ls);
		
		List<String> ls1 = results.stream().collect(Collectors.filtering(a -> a.startsWith("A"), Collectors.toList()));
		System.out.println(ls1);
		
		
		BiFunction<Integer, ? super String, Integer> bf = (i,s)-> i +s.length();
		BinaryOperator<Integer> bo = (a, b) -> {
			if ((a%2)==0)
			System.out.println(" a es par ");
			return Math.addExact(a, b);};
		
		
		Stream<String> st = Stream.<String>of("h", "o", "l", "a!");
		int res = st.reduce(0, bf, bo);
		System.out.println(res);
		
		
	
	}

}
