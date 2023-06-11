package jcp17.clasicas;

public class DeBooleanos {
	
	public static void main(String[] args) {
		
		Boolean tested = null;
		Boolean fixed = 1<3 ? true : null;
		if(fixed && tested) {
		   throw new NullPointerException("shipped");
		}
		throw new NullPointerException("broken");

	}

}
