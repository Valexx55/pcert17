package edu.val.cle.atsistemas.java8;

public interface Secret {

	String magic (double d);
	
}

class MySecret implements Secret {
	
	@Override
	public String magic(double d) {
		return "Poof";
	}
}

/**
 * Qué lambdas pueden sustituir a MySecret
 * 
 * a) (e)->"Poof" x
 * b) (e)-> {"Poof"}
 * c) (e)-> {String e ="";"Poof"}
 * d) (e)-> {String e ="";return "Poof";}
 * e) (e)-> {String e ="";return "Poof"}
 * f) (e)-> {String f ="";return "Poof";} x
 * 
 */
