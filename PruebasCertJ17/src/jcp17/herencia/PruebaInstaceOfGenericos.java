package jcp17.herencia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public  class PruebaInstaceOfGenericos {
	
	public static void main(String[] args) {
		
		List<Integer> ali = Arrays.asList(1, 2, 3, 4, 5);
		recibe(ali);
		Integer i = 6;
		recibeo(ali);//falla - sólo adimite List<Object>
		recibewildcard(ali);//funciona -admite List<?>
		recibes(ali);//falla - sólo adimite supertipos de Number
		
		
	}
	
	private  static <T> void recibe (Collection<? super Integer> recibo)
	{
		
	}
	
	private  static <T> void recibes (Collection<? super Number> recibo)
	{
		
	}
	
	private  static <T> void recibeo (Collection<Object> recibo)
	{
		
	}
	
	private  static <T> void recibewildcard (Collection<?> recibo)
	{
		
	}

}
