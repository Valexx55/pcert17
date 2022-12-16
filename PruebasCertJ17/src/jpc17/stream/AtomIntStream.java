package jpc17.stream;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class AtomIntStream {

	public static void main(String[] args) {

//What will the following code print?
//NO ENTIENDO. REVISAR PARALLEL VIDEOS DE ANTONIO
		AtomicInteger ai = new AtomicInteger();
		Stream<String> stream = Stream.of("old", "king", "cole", "was", "a", "merry", "old", "soul").parallel();//.parallel();
		stream.filter(e -> {
			System.out.println(e);
			ai.incrementAndGet();
			return e.contains("o");
		}).allMatch(x -> x.indexOf("o") > 0);

		System.out.println("AI = " + ai);

	}

}
