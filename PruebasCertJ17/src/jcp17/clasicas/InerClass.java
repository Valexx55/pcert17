package jcp17.clasicas;


public class InerClass {
	public static void main(String args[]) {
		var out = new Outer();
		System.out.println(out.getInner().getOi());
	}
}

class Outer {
	private int oi = 20;

	class Inner {
		int getOi() {
			return oi;
		}
	}

	Inner getInner() {
		return new Inner();
	}
}