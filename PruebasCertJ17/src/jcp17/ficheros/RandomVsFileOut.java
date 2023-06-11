package jcp17.ficheros;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomVsFileOut {

	public static void main(String[] args) throws Exception {

		// RandomAccessFile rf = new RandomAccessFile("holanuevo.txt", "rwd");
		FileOutputStream fs = new FileOutputStream("holanuevo.txt");
		fs.write("HOLA JAMÓN JAMÓN3\n".getBytes());
		// rf.writeChars("HOLA JAMÓN JAMÓN3\n");
		// rf.writeChars("HOLA JAMÓN JAMÓN\n");
		// rf.writeChars("HOLA JAMÓN JAMÓN\n");
		// rf.close();
		/*
		 * while (true) { System.out.println("soy el menoir"); }
		 */

		var tickers = List.of("A", "D", "E", "C", "A");
		var ratio = List.of(1.0, 1.2, 1.5, 1.8, 2.0);
		var map1 = IntStream.range(0, tickers.size()).boxed().collect(Collectors.toMap(i -> tickers.get(i), i -> 1.0/ratio.get(i)));
				//.collect(Collectors.toMap(i -> tickers.get(i), i -> 1.0 / ratio.get(i), (x, y) -> x + y));
				
		map1.forEach((var k, var v)->System.out.printf("%s = %.2f\n",k, v));
		var map2 = map1.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> x - y, LinkedHashMap::new));
		map2.forEach((var k, var v)->System.out.printf("%s = %.2f\n",k, v));
	}
}