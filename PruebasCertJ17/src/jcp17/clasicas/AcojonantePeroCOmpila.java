package jcp17.clasicas;

public class AcojonantePeroCOmpila {
	
	public static void main(String[] args) {
		
		String[] strings = new String[1];
		Object[] objects = strings;
		objects[0] = 0;
		System.out.println(objects[0]);//falla en ejeccuióin pero compla
		//esto es un heap pollution
		//al final Java no alcanza a validar todos los tipos
	}

}
