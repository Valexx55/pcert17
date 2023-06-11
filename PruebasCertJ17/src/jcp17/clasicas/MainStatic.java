package jcp17.clasicas;

public class MainStatic {

	static int count;
	static {
		System.out.println("POR STATIC");
		count = 0;
	}

	MainStatic() {
		count++;
	}

	public static void main(String[] args) {
		System.out.println("INICIO");
		count++;
		MainStatic mother = new MainStatic();
		MainStatic father = new MainStatic();
		MainStatic fawn = new MainStatic();
		System.out.println(father.count);
	}

}
