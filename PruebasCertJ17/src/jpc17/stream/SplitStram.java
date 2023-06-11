package jpc17.stream;

import java.util.Spliterator;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class SplitStram {

	public static void main(String[] args) {
		Stream<String> ss = Stream.of("a", "b", "c", "d", "e");
		Spliterator<String> sit1 = ss.spliterator();
		long s0 = sit1.estimateSize();
		Spliterator<String> sit2 = sit1.trySplit();
		long s1 = sit1.estimateSize();
		long s2 = sit2.estimateSize();
		System.out.println(s0 - (s1 + s2));

		int myFavoriteNumber = 8;
		int bird = ~myFavoriteNumber;
		int plane = -myFavoriteNumber;
		var superman = bird == plane ? 5 : 10;
		System.out.println(bird + "," + plane + "," + --superman);
		
		int g = 012;
		System.out.println(g);
		pruebaFloat(2, 'c');
		pruebaFloat(g);
		
		var service = Executors.newSingleThreadScheduledExecutor();
		/*var result = */service.sub(()->
				   System.out.println("Wake Staff"));
				//System.out.println(result.get());
	}
	
	static void pruebaFloat (float g, char c)
	{
		
	}
	
	static void pruebaFloat (double g)
	{
		
	}


	  
	
}
