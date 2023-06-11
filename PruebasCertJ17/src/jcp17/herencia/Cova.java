package jcp17.herencia;

public class Cova {

	class A {
		public long getCode() {
			return 3;
			// return null;
		}
	}

	class AA extends A {
		public long getCode() {
			return 2;
			// return null;
		}
	}

	public static void main(String[] args) throws Exception {
		A a = new Cova().new A();
		A aa = new Cova().new AA();
		System.out.println(a.getCode() + " " + aa.getCode());

		var str = """
				hello java \
				guru
						""";

		System.out.print(str);
		System.out.print(str.strip());
		// System.out.print("HOLA");
		System.out.println();
		System.out.println(str.length());
		System.out.println(str.strip().length());

		String micad = "HOla";
		micad.replace('H', 'j');
		System.out.println(micad);

		// var z = {1, 2, 3};
		var z2 = new int[] { 1, 2, 3 };
		int[] sz = { 1, 2, 3 };

		int[] sazo = new int[] { 1, 2, 3 };

		char c;
		final long i = 400000;
		c = 'a';// 1
		//i = c; // 2
		//i++; // 3
		c = i; // 4
		//c++; // 5
		System.out.println(c);
	}

	public int getCode() {
		return 1;
	}

}
