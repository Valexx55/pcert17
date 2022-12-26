package jpc17.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionApply {

	public static void main(String[] args) {

//What will the following code print?

		List<String> vowels = new ArrayList<String>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		Function<List<String>, List<String>> f = list -> list.subList(2, 4);
		List<String> vowels2 = f.apply(vowels);
		vowels.forEach(System.out::print);
		System.out.println();
		vowels2.forEach(System.out::print);
		if (vowels == vowels2) {
			System.out.println("Son la misma ee, putenros. VISTAS");
		} else {
			System.out.println("NO Son la misma ee, putenros. VISTAS");
		}

	}

	static void doElements(List l) 
	{     
		l.add("string"); //1    
		System.out.println(l.get(0)); //2 
	}
	}

}
