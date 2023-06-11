package jpc17.stream;

import java.util.Arrays;
import java.util.List;

public class EjercicioOlga {

	
	public static void main(String ... args) {
		//int[] array_numeros = {10, 5, 1};
		
		List<Integer> lista = Arrays.asList(10, 5, 1);
		//List<List<Integer>> lista2 = List.of({10, 5, 1}, {10, 5, 1});
		//lista.stream().flatMapToInt(n-> n).max().getAsInt();
		int nmax = lista.stream().mapToInt(a->a).max().orElse(0);
		int nmin = lista.stream().mapToInt(a->a).min().orElse(0);
		
		int resultado = nmax-nmin;
		System.out.println(resultado);
		
		long n = 0b11;
		long s = 0B111;
		long creditCardNumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;
		float pi =  3.14_15f;
		long hexBytes = 0xFF_EC_DE_5e;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0X7fff_ffff_ffff_ffffl;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;
		
		System.out.println(n);
		System.out.println(s);
		
	}
	
	private static int resultado (List<Integer> lista)
	{
		int resultado = 0;
		
			if ((lista!=null)&&!(lista.isEmpty()))
			{
				int nmax = lista.stream().mapToInt(a->a).max().orElse(0);
				int nmin = lista.stream().mapToInt(a->a).min().orElse(0);
				resultado = nmax-nmin;
			}
		
		return resultado;
	}
}
