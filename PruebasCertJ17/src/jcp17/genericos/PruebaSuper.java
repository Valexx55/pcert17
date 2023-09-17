package jcp17.genericos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import jcp17.clasicas.DeBooleanos;

public class PruebaSuper {
	
	public static void main(String[] args) {
		
		//List<? extends Number> lnumeros = new ArrayList<>();
		List<? super Number> lnumeros = new ArrayList<>();
		//List<? super Integer> lenteros = new ArrayList<>();
		List<Number> lenteros = new ArrayList<>();
		//lnumeros.addAll(lenteros);
		lenteros.add(5);
		//Integer i = (Integer)lnumeros.get(0);
		
		//pintaNumeros(lenteros);
		//pintaNumeros(lnumeros);
		lnumeros.add(5);
		lnumeros.add(5.0f);
		
		List listaCas = new ArrayList<>();
		listaCas.add("HOLA");
		listaCas.add(new DeBooleanos());
		//pintaNumeros(listaCas);
		
		/*if (lenteros instanceof List<Object>)
		{
			System.out.println("es una lista de enteros");
		} else {
			System.out.println("No es una lista de enteros");
		}*/
		
		//Collections.sort(Arrays.asList('1', 2, 3, 4), null);
	   
		 LinkedList <Integer> q = new LinkedList<>();
		 q.add(10);
		 q.add(12);
		 q.add(13);
		 //q.remove(1);
		 q.remove();
		 System.out.print(q);

		 ArrayList<Integer> q1 = new ArrayList<>();
		 q1.add(10);
		 q1.add(12);
		 //q1.remove(1);
		 //q1.remove(10);
		 System.out.print(q1);
		 
		 TreeSet<Integer> ts = new TreeSet<>();
		// ts.add(null);
		 
		 TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		 tm.putAll(tm);
		 
		 NavigableSet<String> ns = new TreeSet<>();
		 ns.add("1");
		 ns.add("2");
		 ns.add("3");
		 /*ns.add(2);
		 ns.add(3);*/
		 System.out.println(ns);
		 
		 SortedSet<String> ns2 = ns.subSet("a", "d");
		 System.out.println(ns2);
		 ns2.add("c");
		 
		 System.out.println(ns2);
		 
		 
	}
	/*
	private static <T extends Number> void  pintaNumeros3 (List<? extends Integer> listaNumeros)
	{
		if (listaNumeros instanceof List<Integer>)
		{
			System.out.println("es una lista de enteros");
		} else {
			System.out.println("No es una lista de enteros");
		}
	}
	
	private static <T extends Number> void  pintaNumeros4 (List<Object> listaNumeros)
	{
		if (listaNumeros instanceof List<Integer>)
		{
			System.out.println("es una lista de enteros");
		} else {
			System.out.println("No es una lista de enteros");
		}
	}
	
	private static <T extends Number> void  pintaNumeros2 (List<T> listaNumeros)
	{
		if (listaNumeros instanceof List<Integer>)
		{
			System.out.println("es una lista de enteros");
		} else {
			System.out.println("No es una lista de enteros");
		}
	}
	
	private static void  pintaNumeros (List<? super Integer> listaNumeros)
	{
		if (listaNumeros instanceof List<Integer>)
		{
			System.out.println("es una lista de enteros");
		} else {
			System.out.println("No es una lista de enteros");
		}
	}
	*/
	
	/*private static <T super Number> void  pintaNumeros (List<T> listaNumeros)
	{
		
	}*/

}
