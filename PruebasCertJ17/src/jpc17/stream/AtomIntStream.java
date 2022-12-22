package jpc17.stream;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class AtomIntStream {

	public static void main(String[] args) {

//What will the AI prints? -- un número entre 1 y 8
		AtomicInteger ai = new AtomicInteger();
		Stream<String> stream = Stream.of("old", "king", "cole", "was", "a", "merry", "old", "soul");//.parallel();//.parallel();
		stream.filter(e -> {
			System.out.println(e);
			ai.incrementAndGet();
			return e.contains("o");
		}).allMatch(x -> x.indexOf("o") > 0);//esta corta el grifo en cualquier momento
		//pero como es parallel el stream, no sabemos en qué momento lohará
		//sin paralelizarlo, siempre valdría 1

		System.out.println("AI = " + ai);

	}

}
