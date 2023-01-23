package jcp17.clasicas;

public class PorValorYRef {
	
	
	
	private static void porRef2 (String cad)
	{
		cad = null;
		
		//return cad;
	}
	
	private static String porRef (String cad)
	{
		cad = null;
		
		return cad;
	}
	
	private static int porValor (int n)
	{
		n = 8;
		
		return n;
	}
	
	public static void main(String[] args) {
		
		String saludo = "hola";
		porRef2(saludo);
		System.out.println("despues de pr2 = "+saludo);
		System.out.println(porRef(saludo));
		System.out.println("despues de pr = "+saludo);
		int n = 10;
		System.out.println(porValor(n));
		
	}

}
