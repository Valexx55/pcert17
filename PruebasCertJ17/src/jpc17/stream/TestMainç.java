package jpc17.stream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMainç {

	public Map<String, Long> countWords(Stream<String> wordStream){       
		  Map<String, Long> counts = wordStream.collect(Collectors.groupingBy(String::equals, Collectors.counting()));        
				 return counts;   }

	public static void main(String[] args) {
		
	}

}
