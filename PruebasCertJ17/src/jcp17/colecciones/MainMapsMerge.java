package jcp17.colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MainMapsMerge {

	public static void main(String[] args) {
		Map<Integer, String> mis = new HashMap<>();

		mis.put(1, "Ana");
		mis.put(2, "Bea");
		mis.put(3, null);
		mis.put(4, "Daniela");

		BiFunction<String, String, String> bd = (s, a) -> null;
		BiFunction<String, String, String> bd1 = (s, a) -> s + a;


		mis.merge(3, "carmen", bd);
		
		System.out.println(mis);

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("a", 1);
		map1.put("b", 1);
		map1.merge("b", 1, (i1, i2) -> i1 + i2);
		map1.merge("c", 3, (i1, i2) -> i1 + i2);
		System.out.println(map1);
		
		//{a=1, b=2}

		//A NullPointerException will be thrown at run time
		
		//{a=1, b=2, c=3}

		//{a=1, b=1, c=3}	

	}

}
