package jpc17.stream;

import java.util.stream.Stream;

public class StreamCorto {
	
	public static void main(String[] args) {
		var stream = Stream.iterate("", (s)->s+ "1");
		System.out.println(stream.limit(2).map(x->x + "2").toList());
		var stream2 = Stream.iterate("", (s)->s+ "1");
		System.out.println(stream2.limit(2).map(x->x + "2"));
	}

}
