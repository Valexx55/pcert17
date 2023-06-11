package jpc17.stream;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class PruebaLibroTestLong {
	
	public static void main(String[] args) {
		
		Iterator i = LongStream.of(6, 8, 10).mapToInt(x-> (int)x).boxed().collect(Collectors.groupingBy(x ->x, Collectors.toSet())).entrySet().iterator();
		Iterator i2 = LongStream.of(6, 8, 10).mapToInt(x-> (int)x).boxed().collect(Collectors.groupingBy(x ->x, Collectors.toList())).entrySet().iterator();
		LongStream.of(6, 8, 10).mapToInt(x-> (int)x).boxed().collect(Collectors.toList()).forEach(System.out::println);
		while (i.hasNext())
		{
			Entry<Object, Object> e = (Entry<Object, Object>) i.next();
			System.out.println(e.getValue().getClass());
			//System.out.println(i.next());
		}
		while (i2.hasNext())
		{
			Entry<Object, Object> e = (Entry<Object, Object>) i2.next();
			System.out.println(e.getValue().getClass());
			//System.out.println(i2.next());
		}
	}

}
