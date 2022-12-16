package jpc17.stream;

import java.util.Arrays;
import java.util.List;

public class TestLambda {
	
	//PARA QUE SALGA 
	//Old Rating A
	//New Rating R hay que sustitur la línea del Peek por forEach
	//el peek, al no ser final, si no tiene a quien entregar sus resultados
	//no se ejecuta.

	public static void main(String[] args) {
		
		List<Character> ratings = Arrays.asList('U', 'R', 'A'); 
		ratings.stream().filter(x->x=='A')//1
		//.forEach(System.out::println)
		.peek(x->System.out.println("Old Rating "+x))//2
		//.map(x->System.out.println('R'));
		.map(x->x=='A'?'R':x)//3
		.forEach(x->System.out.println("New Rating "+x));
		//.peek(x->System.out.println("New Rating "+x));//4
	}

}
