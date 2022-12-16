package jpc17.stream;

import java.util.stream.IntStream;

public class IntStreamRangeBoxed {

	public static void main(String[] args) {

//What will the following code print?

		Object v1 = IntStream.rangeClosed(10, 15).boxed().filter(x -> x > 12).parallel().findAny();

		Object v2 = IntStream.rangeClosed(10, 15).boxed().filter(x -> x > 12).sequential().findAny();

		System.out.println(v1 + ":" + v2);

//(Note: < and > in the options below denote the possible output and not the sign themselves.)
	}

}
