package edu.val.cle.atsistemas.java8;

import java.util.function.Function;

public class TestFunction {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> s = a->a+4;
		Function<Integer, Integer> t = a->a*3;
		Function<Integer, Integer> c = s.compose(t);
		System.out.println(c.apply(1));
	}

}

/**
 * Qué devuelve este código
 * 
 * a) 7 x
 * b) 15
 * c) No compila por los tipos de las expresiones lambda
 * d) No compila por la llamada a compose
 * e) No compila por otra razón
 * 
 * */
