package jpc17.enumerados;

enum Pets { 
	
	DOG("D"), CAT("C"), FISH("F");
	
	final static String prefix = "I am ";
	String name;

	Pets(String s) {
		name = prefix + s;
	}

	public String getData() {
		return name;
	}
}
