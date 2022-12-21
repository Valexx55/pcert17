package jcp17.seccionesdecodigo;

public class SeccionesInicializacion {
	public static void main(String args[]) {
		SeccionesInicializacion obj = new SeccionesInicializacion(5);
	}

	////SE EJECUTA LO PRIMERO
	int m;
	static int i1 = 5;
	static int i2;
	int j = 100;
	int x;
	//SE EJECUTA LO PRIMERO
	
	public SeccionesInicializacion(int m) {
		//6  40   0  30  5
		System.out.println(i1 + "  " + i2 + "   " + x + "  " + j + "  " + m);
	}

	{
		j = 30;//SE EJECUTA AL INICIO DEL CONSTRUCTOR
		i2 = 40;
	} 
	static {
		i1++; //SE EJECUTA LO SEGUNDO
	} 
}
