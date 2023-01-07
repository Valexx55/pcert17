package jcp17.clasicas;

public class AnidadasClass {
	public class A {
	}

	public static class B {
	}

	public static void main(String args[]) {
		class C {
		}
		// 1
		new AnidadasClass().new A();
		//int a, b, c=100;
		//int a=100, b, c;
		//int a, b, c; a = b = c = 100;
		//int a = b = c = 100;
		
		//other code that initializes m 
		var m;
		m = 0;
		switch( m ){      
		case 32  : System.out.println("32");   
		break;      
		case 64  : System.out.println("64");   
		break;      
		case 128 : System.out.println("128");  break;   }
	}
}
