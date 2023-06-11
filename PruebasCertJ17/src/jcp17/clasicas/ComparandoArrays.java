package jcp17.clasicas;

import java.util.Arrays;

public class ComparandoArrays {

	public static void main(String[] args) {
		String[] a = { "ho", "e", "l", "l" };
		String[] b = {"ho"};
		int x = Arrays.compare(a, b);
		int y = Arrays.mismatch(a, b);
		System.out.println(x + " " + y);
	}
}
