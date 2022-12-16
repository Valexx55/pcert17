package jcp17.clasicas;
/**
 * 
 * DIFERENCIA ENTRE PRE-INCREMENT Y POST INCREMENT
 * 
 * a) c = a++ --> pirmero hace la asignación de 'a' a 'c' y luego suma 1 a 'a'
 * b) c = ++a --> pirmero suma a 'a' 1 y luego hace la asignación a c
 * 
 * en el caso a), c acaba valiendo uno menos que a
 * en el caso b), c y a acaban valiendo lo mismo
 *
 */

public class Clasicas1 {
	
	//i vale 4
	public static void main(String[] args) {
		
		var ca = new char[] { 'a', 'b', 'c', 'd', 'e' };
		var i = 0;
		for(var c:ca)
		{
			switch (c) {
			case 'a' -> i++;
			case 'b' -> ++i;
			case 'c', 'd' -> i++;
			}
		}System.out.println("i = "+i);
		
	}

	

}
