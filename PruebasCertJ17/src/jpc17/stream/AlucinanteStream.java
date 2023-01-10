package jpc17.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlucinanteStream {

	public static void main(String[] args) {

		//Given:
		List<String> letters = Arrays.asList("j", "a", "v","a");
		//String word = letters.stream().reduce("", (a, b)->a.concat(b)).get();//no puede ser get no es de String
		String word = letters.stream().collect(Collectors.joining());//no puede ser get no es de String
		//String word = letters.stream().collect(Collectors.groupingBy(a->a)).toString();// no puede ser pq Devuelve un mapa de listas a cada string (valor, le asocia una clave - valor devuelto -) si ser repite la clave, se add a la lista
		//String word = letters.stream().collect(Collectors.groupingBy(a->"")).toString();//todos los elementos j a v a terminan asociados a la misma clave, cadena vacía
		System.out.println(word);
		
		//Which of the following code fragments when inserted in the above code independent of each other will cause it to print java?
	}
}
