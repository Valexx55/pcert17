package jpc17.sobrecargaosobreescritura;

interface Flyer {
	String getName();
}

class Bird implements Flyer {
	public String name;

	public Bird(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class Eagle extends Bird {
	public Eagle(String name) {
		super(name);
	}
}

public class TestClass {
	public static void main(String[] args) throws Exception {
		Flyer f = new Eagle("American Bald Eagle"); 
		// PRINT NAME HERE
		System.out.println(f.getName());
		//falla System.out.println(f.name);
		System.out.println(((Bird)f).getName());
		System.out.println(((Eagle)f).getName());
		//falla System.out.println(Eagle.name);
		//falla System.out.println(Eagle.getName(f));
	}
}