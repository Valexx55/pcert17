package jcp17.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListasVistas {
	
	public static void main(String[] args) {
		
		String[] arr = new String[] {"A1", "A2"};

		List<String> ls = new ArrayList<>();
		ls.add("L1");ls.add("L2");

		List<String> la = Arrays.asList(arr);
		List<String> lf = List.of(arr);
		List<String> lc = List.copyOf(ls);
		List<String> lu = Collections.unmodifiableList(ls);
		List<String> lsub = ls.subList(0, 2);

		arr[1]="A3";
		ls.set(1, "L3");

		// line n1
		
		//lc.add("HOLA");

		System.out.println("la=" + la);//A1, A3
		System.out.println("lf=" + lf);//A1, A2
		System.out.println("lc=" + lc);//L1, L2
		System.out.println("lu=" + lu);//L1, L3
		System.out.println("lsub=" + lsub);//L1, L3
		//lsub.set(1, "VAL");
		//lu.set(1, "VAL");

		//ls.remove(0);
		System.out.println("lsub=" + lsub);//L1, L3
		System.out.println("lu=" + lu);//L1, L3
		lsub.remove(1);
		lsub.add("JAL");
		System.out.println("lsub=" + lsub);//L1, L3
		System.out.println("lu=" + lu);//L1, L3
		
		imprimeValores(lsub);
		List<Object> l0 = List.copyOf(la);
		imprimeValores(l0);
		
	}

	private static void imprimeValores (List<? super String> lista)
	{
		
	}
	
	private static void printValues (List<? super String> lista)
	{
		
	}
	
}
