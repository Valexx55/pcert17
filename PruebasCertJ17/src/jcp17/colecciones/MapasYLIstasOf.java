package jcp17.colecciones;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapasYLIstasOf {

	// What changes can be done to the following code so that it will compile and
	// run without an exception?

	public static void main(String[] args) {

		List<String> keys = List.of("a"); // 1
		//keys.add("b"); // 2

//		Map<String, String> map = Map.of(); // 3
		Map<String, String> map = new TreeMap<>(); // 3

		int i = 0;
		for (var key : keys) {
			map.put(key, "----");
		}
		System.out.println(keys + " " + map.size());

	}

	//la línea 14 genera una expceción. Las listas construidas con el operador List.of son inmodificables. 
	//igual pasa con la línea 20 Map.of crea un mapa no modificable.
}
