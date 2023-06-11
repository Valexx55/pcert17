package jcp17.herencia;

public class PatronMatching {

	public static void main(String args[]) {
		B b = new C();
		A a = b;

		if (a instanceof A a1) 
			a1.a();
		
		if (a instanceof B b1) 
			b1.a();
		
		if(a instanceof B j || a instanceof A k ) 
		{
			if(j!=null) j.b();
			if(k!=null) k.a(); 
		}
	}

	static class A {
		void a() {
			System.out.println("a");
		}
	}

	static class B extends A {
		void b() {
			System.out.println("b");
		}
	}

	static class C extends B {
		void c() {
			System.out.println("c");
		}
	}

}
