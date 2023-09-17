package jcp17.colecciones;

import java.util.ArrayList;
import java.util.Arrays;

public class MainAsList {
	
	public static void main(String[] args) {
		
		String[] sa = { "charlie", "bob", "andy", "dave" };     
		var ls = new ArrayList<String>(Arrays.asList(sa));     
		ls.sort((var a, var b) -> a.compareTo(b));     
		System.out.println(sa[0]+" "+ls.get(0)); 
		
	}
	
	

}
