package jcp17.pattermatching;

import java.io.File;

/**
 * 
 *  CUANDO SE USA EL NUEVO instanceOf
 *  se puede abreviar c�digo, ESTO ES novedad DEL JAVA 16
 *  
 *  PORQUE SI HACES
 *  if (a instanceOf String b)
 *  //b autom�ticamente se convierte a String
 *  
 *  lo que pasa es que b, como nombre de variable, no puede repertirse
 *  si ya existe una con ese nombre en ese �mbito
 *   
 *   
 *  La NOVEDAD adem�s es que instanceOf String b, no compilar�a
 *  si a es un objeto de una clase no relacioanda jer�rquicamente por herencia
 *  com String
 *
 */

abstract class Base {
	abstract int power();
}

class A extends Base {
	@Override
	int power() {
		return 0;
	}
}

public class TestClass {
	static void processBase(Base base) {
		A a = null;
		//f (base instanceof File c){//Fallar�a porque Base y FIle NO TIENE RELACI�N JER�RQUICA 
		
		//if (base instanceof A a) {//la que falla
		if (base instanceof A c) {//FUNCIONA
			System.out.println(a.power());
		}
		System.out.println("a is " + a);
	}

	public static void main(String args[]) {
		processBase(new A());
	}
}