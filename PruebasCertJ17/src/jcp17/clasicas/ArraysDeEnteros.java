package jcp17.clasicas;

public class ArraysDeEnteros {
	
	public static void main(String[] args) {
		int [] [] array = {{0}, {0, 1}, {0, 1, 2}, {0, 1, 2, 3}, {0, 1, 2, 3, 4}}; 
		var arr1 = array[4]; 
		////NO COMPILA System.out.println (arr1[4][1]); //detecta que no es un array si no un número [1] 
		System.out.println (array[4][1]);
	}

}
