package jpc17.stream;

import java.util.List;
import java.util.function.Function;

public class Reduce {

	public static void main(String[] args) {
		
		var listaNums = List.of(1, 5, 2, 8, 4, 5, 6, 9, 1);
		listaNums.stream().reduce((a,b)->a-b).ifPresent(System.out::println);
		var res = listaNums.stream().reduce(1, (a,b)->a-b);
		System.out.println(res);
		var res2 = listaNums.stream().reduce(1, (a, b)->a-b, (a,b)->a*b);
		System.out.println(res2);
		
		
	}
}
