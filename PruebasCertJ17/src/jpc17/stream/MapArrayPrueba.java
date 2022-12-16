package jpc17.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapArrayPrueba {

	public static void main(String[] args) {

//Given: //REVISAR flatMapToInt
//
		int[][] iaa = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		long count = Stream.of(iaa).flatMapToInt(IntStream::of).map(i -> i + 1).filter(i -> i % 2 != 0)
				.peek(System.out::print).count();
		System.out.println(count);

//What will be the output?
	}

}
