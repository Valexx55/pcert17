package jcp17.clasicas;

public class InmutableEjemplo {
	
	
	static String una = "UNA";
	
	public static void main(String[] args) {
		
		
		
		InmutableEjemplo.cotieneA(una);
		
		System.out.println(una);//despues una sigue valiendo lo que valía. su valor no se ha alterado: INMUTABLE
		
	}
	
	private static boolean cotieneA (String a)
	{
		boolean contiene = false;
		
			if (a==una)
			{
				System.out.println("Son iguales");//a y una son la misma. se pasa por referencia
			} else {
				System.out.println("Son distintas");
			}
			
			contiene = a.contains("A");
			a = "14";// Al cambiar el estado, se genera una nueva variable
			
			
			if (a==una)
			{
				System.out.println("Son iguales 1 ");
			} else {
				System.out.println("Son distintas 1 ");
			}
		
		return contiene; 
	}

}
