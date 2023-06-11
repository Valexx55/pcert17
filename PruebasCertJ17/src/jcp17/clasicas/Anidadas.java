package jcp17.clasicas;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;

public class Anidadas {
	public OtherClass oc = new OtherClass();

	public static void main(String[] args) {

		String gola = "hola";
		gola.concat("adios");
		System.out.println(gola);

		char a = 'a', b = 98; // 1
		int a1 = a; // 2
		int b1 = (int) b; // 3
		System.out.println((char) a1 + (char) b1); // 4

		System.out.println("" + 5 + 6); // 1
		System.out.println(5 + "" + 6); // 2
		System.out.println(5 + 6 + ""); // 3
		System.out.println(5 + 6); // 4

		String s1 = new String("Hello World");
		String s2 = """
				Hello World""";
		System.out.println((s1 == s2) + " " + s1.equals(s2));

		Deque<Integer> d = new ArrayDeque<>();
		d.add(1);
		d.push(2);
		d.pop();
		d.offerFirst(3);
		d.remove();
		System.out.println(d);
		
		Optional<String> stro = Optional.of(null);
		System.out.println(stro);
	}

}

class OtherClass {
	int value;
}