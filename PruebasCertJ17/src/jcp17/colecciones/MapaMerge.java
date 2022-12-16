package jcp17.colecciones;

import java.util.HashMap;
import java.util.Map;

public class MapaMerge {

	public static void main(String[] args) {

//What will the following code print?// 

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("a", 1);
		map1.put("b", 1);
		//con merge, si ya exist�a un valor asociado a esa clave, lo reemplaza con el valor
		//devuelto por la funci�n an�nima
		//la funci�n an�mia es BiFunction que recibe el segundo par�metro
		//y el valor ya asociado a la clave (1er par�metro)
		//si no exist�a esa clave o era null, le asocia el valor dado 
		//(1 en este caso), que no puede ser null (puede pero salta excepci�n)
		map1.merge("b", 1, (i1, i2) -> {
			//i1 es el valor nuevo e i2 el valor que ya estaba asociado
			System.out.println(" "+i1 + " " + i2);
			return i1 + i2;});
		map1.merge("c", 3, (i1, i2) -> {System.out.println(" "+i1 + " " + i2);
		return i1 + i2;});
		
		System.out.println(map1);//el mapa imprime a=1, b=2, c=3
		//el valor de a no se toca
		//el de b se sustituye por la funci�n de remapeo
		//el de c, al no existir esa clave, toma el valor dado 3

}

}
