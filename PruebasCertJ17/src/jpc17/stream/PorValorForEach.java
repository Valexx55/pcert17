package jpc17.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PorValorForEach {

	public static void main(String[] args) {

		List<String> sList = Arrays.asList("HOLA", "ADIOS");
		
		sList.stream().forEach(s -> s = s + "x");
		
		List<Double> dList = Arrays.asList(10.0, 12.0);
		dList.stream().forEach(x -> {
			x = x + 10;
		});
		
		dList.stream().forEach(d -> System.out.println(d));
		System.out.println(dList.stream().map(x -> x = x + 10).toList());
		System.out.println(sList);
		
		List<Integer> ls = Arrays.asList(10, 47, 33, 23);
		System.out.println(ls.stream().max(Comparator.comparing(a->a)).get());

	}

}
