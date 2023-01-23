package jcp17.interfaces;


interface I1 {
	int VALUE = 1;

	void m1();
}

interface I2 {
	int VALUE = 2;

	void m1();
}


public  class Herencia2Interfaces implements I1, I2 {
	public void m1() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Herencia2Interfaces tc = new Herencia2Interfaces();
		((I1) tc).m1();
	}

	
}
