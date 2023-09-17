package jcp17.records;

import java.util.List;

public record Hello<T>(T t) {
	/*public Hello(T t) {
		this(t);
		this.t = t;
	}*/

	/*private void println(T message) {
		System.out.print(t + "-" + message);
	}*/
	

//	private <T> void println(T message) {
//		System.out.println(t + "-" + message);
//	}
	
	private <T> void  println(T message) {
		System.out.println(t + "-" + message);
		if (message instanceof String) System.out.println("es un String");
		if (message instanceof Number) System.out.println("es un Number");
	}

	public static void main(String[] args) {
		//new Hello<String>("hi").println(1);
			
		new Hello(4).<Integer>println("h");
		new Hello<Integer>(4).<Integer>println(7);
		//new Hello<String>("hola").<Float>println("j");
		new Hello<String>("hola").<Integer>println(7);
		new Hello<String>("hola").println(6);
		new Hello<String>("hola").<Number>println(3);
		new Hello<>("hola").<Number>println(4);
		new Hello<Number>(3).<Number>println(4);
		new Hello<Number>(3).<Number>println(4);
		
		List<?> q = List.of("mouse", "parrot"); //<--Se instancia como List<Object> (no podemos aplicar operador de String a sus elementos)
		var v = List.of("mouse", "parrot");//<--Se instancia como List<String>. Se infiere (Sí podemos aplicar operador de String a sus elementos)
		List<> q1 = List.of("mouse", "parrot"); //<--Se instancia como List<Object> (no podemos aplicar operador de String a sus elementos)
		
		List q2 = List.<String>of("mouse", "parrot"); //<--Se instancia como List<Object> (no podemos aplicar operador de String a sus elementos)
		
		
		
		
	}
}