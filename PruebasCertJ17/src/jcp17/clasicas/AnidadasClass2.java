package jcp17.clasicas;

public class AnidadasClass2 {
	class C {}
	static class B {}
	static void nada ()
		{
			B b = new AnidadasClass2.B();// es válido
			B b1 = new B();// es válido (por ser estático)
			//B b2 = new AnidadasClass2.new B(); //NO ES Valido
			C c = new AnidadasClass2().new C(); //es valido
			//C c1 = new C(); //NO es válido
		}
}