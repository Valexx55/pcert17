package jcp17.genericos;

import java.util.ArrayList;
import java.util.List;

public class ListPorque {


	
	public static void main(String[] args) {
		
		List<? extends Number> ln = new ArrayList<Integer>();
		//List<Number> ln2 = new ArrayList<? extends Integer>();
	}
}
