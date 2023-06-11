package jcp17.clasicas;

import java.util.List;

public class VarFinal {
	
	public static void main(String[] args) {
		List<Integer> listaInt = List.of(1,  2, 3,  4,  5);
		
		for (final var i : listaInt)
		{
			System.out.println(i);

		}
	}

}
