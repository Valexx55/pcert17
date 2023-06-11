package jcp17.herencia;

import java.io.IOException;

interface House {
//	public default String getAddress() {
//		return "101 Main Str";
//	}
	public String getAddress();
}

interface Office {
	/*
	 * public default String getAddress() { return "101 Smart Str"; }
	 */
	public String getAddress();
}

class HomeOffice implements House, Office {
	public String getAddress() {
		return "R No 1, Home";
	}
}

public class InterOffice {
	
	class A 
	{     
		void a(){ System.out.println("a"); }
		{
			A a = new A();
			if (a instanceof A e)
			{
				e.a();
			}
				
		}
	
	}
	
	public static void main(String[] args) throws Exception {
		House h = new HomeOffice(); // 1
		System.out.println(h.getAddress()); // 2

		int k = 0;
		try {
			//int i = 5 / k;
			joder();
		} catch (ArithmeticException e) {
			System.out.println("1");
			return;
		} catch (RuntimeException e) {
			System.out.println("2");
			return;
		} catch (IOException e) {
			System.out.println("3");
		} finally {
			System.out.println("4");
		}
		System.out.println("5");
	}
	
	private static void joder() throws Exception 
	{
		throw new Exception();
	}

}