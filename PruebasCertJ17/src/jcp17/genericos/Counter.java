package jcp17.genericos;

import java.io.IOException;

public class Counter<T> { // 1
	T t;

	public <T> int count(T[] ta, T t) { // 2
		this.t = t; // 3
		int count = 0;
		for (T x : ta) {
			count = x == t ? count + 1 : count;// 4
		}
		return count;
	}

	public class TestClass {
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
}